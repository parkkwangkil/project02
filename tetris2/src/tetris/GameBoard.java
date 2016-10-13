package tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import tetris.BoxsShape.TetrisBlocks;


public class GameBoard extends JPanel implements ActionListener {

	/**
	 * ���� �簢���� ������ ��Ʈ���� ����̶�� �ϰ� �� ��Ʈ���� ����� �̷�� ���� �簢���� ����̶� �Ѵ�.
	 * 
	 * if���� ����ϴ� ��� if ���� �ڵ尡 1 ���� ��� {}����� ���� �� �� ������ �� �ڵ忡���� �������� �ʴ´�.\
	 * 
	 * �ϳ��� ��Ʈ���� ����� 4���� ������� �̷���� �ִ�.
	 */

	// ���� ��ġ ����
	/**
	 * ���� ��� �ʵ��� ���� - 10���� ����� ����.
	 */
	final int BoardWidth = 10;
	/**
	 * ���� ��� �ʵ��� ���� - 22���� ����� ����.
	 */
	final int BoardHeight = 22;

	Timer timer;
	/**
	 * ��Ʈ���� ����� ���������� Ȯ���Ѵ�.
	 */
	boolean isFallingFinised = false;
	/**
	 * ������ ���� ����
	 */
	boolean isStarted = false;
	/**
	 * ������ ���� ��û ����
	 */
	boolean isPaused = false;
	/**
	 * ������ ������ ����� X ��ǥ
	 */
	int locationX = 0;
	/**
	 * ������ ������ ����� Y ��ǥ
	 */
	int locationY = 0;
	/**
	 * ��Ʈ���� ����� ���� ������ ���� ��Ʈ���� ����� ������ ������ �ִ�.
	 */
	BoxsShape pieceShape;
	/**
	// * ��Ʈ���� ����� �̸����� ���� �ϴ� enum �̸� ���� ��ϵ��� ��ġ�� ����� � ��Ʈ���� ������� �����ϴ� ��Ȱ�� �Ѵ�.
	 */
	TetrisBlocks[] board;

	/**
	 * ������ ������ ��
	 */
	int countLinesRemoved = 0;
	/**
	 * TetrisWindow���� ������ ���� ���� ǥ�� ��
	 */
	JLabel statusbar;

	public GameBoard(TetrisWindow parent) {
		setFocusable(true); // �� ��ü�� �����ϴ� â�� ��Ŀ���� ������.
		pieceShape = new BoxsShape();
		timer = new Timer(400, this); // actionPerformed�� 400 ms ���� ���� ����
		timer.start(); // Ÿ�̸� ����

		statusbar = parent.getStatusbar();

		board = new TetrisBlocks[BoardWidth * BoardHeight];

		addKeyListener(new TetrisKeyListener());
		clearBoard();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (isFallingFinised) {
			isFallingFinised = false;
			newPiece();
		} else {
			oneLineDown();
		}
	}
	/**
	 * ȭ���� ���� / ����ȭ���� ��ü ���� ����
	 * 
	 * @return ���� ����� ���� ����
	 */
	int squareWidth() {
		return (int) getSize().getWidth() / BoardWidth;
	}
	/**
	 * ȭ���� ���� / ����ȭ���� ��ü ���� ����
	 * 
	 * @return ���� ����� ���� ����
	 */
	int squareHeight() {
		return (int) getSize().getHeight() / BoardHeight;
	}
	
	/**
	 * board�� ����� ����� ������ ��ȯ�Ѵ�.
	 * 1���� �迭�� 2���� �迭 ó�� ����Ѵ�.
	 * @param x ����� ���� ��ġ
	 * @param y ����� ���� ��ġ
	 * @return
	 */
	TetrisBlocks shapeAt(int x, int y) {
		return board[(y * BoardWidth) + x];
	}
	/**
	 * ������ �����ϴ� �޼ҵ�
	 */
	public void start() {
		if (isStarted) { // �̹� �����Ͽ����� Ȯ���Ѵ�.
			return;
		}

		isStarted = true;
		isFallingFinised = false;
		countLinesRemoved = 0;
		clearBoard();

		newPiece();
		timer.start();
	}
	/**
	 * ���� ���� Ȥ�� �ٽ� ����
	 */
	private void pause() {
		if (!isStarted) { // ���ۻ��°� false �� �Ǿ����� Ȯ���Ѵ�.
			return;
		}

		isPaused = !isPaused;

		if (isPaused) {
			timer.stop();
			statusbar.setText("paused");
		} else{
			timer.start();
			statusbar.setText("score : " + countLinesRemoved);
		}
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Dimension size = getSize();
		int boardTop = (int) size.getHeight() - BoardHeight * squareHeight();

		// �׿� �ִ� ����� �׸���.
		for (int nowHeight = 0; nowHeight < BoardHeight; ++nowHeight) {
			for (int nowWidth = 0; nowWidth < BoardWidth; ++nowWidth) {
				
				TetrisBlocks shape = shapeAt(nowWidth, BoardHeight - nowHeight - 1);
				if (shape != TetrisBlocks.NoShape)
					drawSquare(g, 0 + nowWidth * squareWidth(), boardTop + nowHeight
							* squareHeight(), shape);
			}
		}

		// ���� �������� �ִ� ��Ʈ���� ����� �׸���.
		if (pieceShape.getShape() != TetrisBlocks.NoShape) {
			// ��Ʈ���� ����� �׸���.
			for (int i = 0; i < 4; ++i) {
				int x = locationX + pieceShape.getX(i);
				int y = locationY - pieceShape.getY(i);
				drawSquare(g, 0 + x * squareWidth(), boardTop
						+ (BoardHeight - y - 1) * squareHeight(),
						pieceShape.getShape());
			}
		}
	}
	/**
	 * ��Ʈ���� ����� �ٴڱ��� �ѹ��� �̵� ��Ų��.
	 */
	private void dropDown() {
		int newY = locationY;
		while (newY > 0) {
			if (!tryMove(pieceShape, locationX, newY - 1))
				break;
			--newY;
		}
		pieceDropped();
	}
	/**
	 * ��Ʈ���� ����� �Ʒ��� �̵� ��Ų��.
	 */
	private void oneLineDown() {
		if (!tryMove(pieceShape, locationX, locationY - 1)) {
			pieceDropped();
		}
	}
	/**
	 * board�� ����� ������ TetrisBlocks.NoShape�� ���� ����(�ʱ�ȭ)�Ѵ�.
	 * 
	 * �� �Լ��� ������� ������ nullpointer ���� ������ �߻��Ѵ�.
	 */
	private void clearBoard() {
		for (int i = 0; i < BoardHeight * BoardWidth; i++) {
			board[i] = TetrisBlocks.NoShape;
		}
	}
	/**
	 * 1. ��Ʈ���� ����� board ����Ѵ�. ��Ʈ���� ����� �׿� �ִ� ������ �Ұ����� ������� �����Ѵ�. 2. ���� ���� �����
	 * �ҷ��´�. 3. ��Ʈ���� ����� �����ؾ� �ϴ��� Ȯ���ϰ� ���ο� ��Ʈ���� ����� �����Ѵ�.
	 */
	private void pieceDropped() {
		for (int i = 0; i < 4; ++i) { // ��Ʈ���� ����� 4���� ������� �̷���� �ִ�.
			int x = locationX + pieceShape.getX(i);
			int y = locationY - pieceShape.getY(i);
			board[(y * BoardWidth) + x] = pieceShape.getShape();
			System.out.println("add : "+((y * BoardWidth) + x) + " shape : "+pieceShape.getShape());
		}

		removeFullLines();

		if (!isFallingFinised) {// ���� ����� ���� �̴�.
			newPiece();
		}
	}
	/**
	 * ���ο� ��Ʈ���� ����� �����Ѵ�.
	 */
	private void newPiece() {
		pieceShape.setRandomShape();

		// ����� �����Ǵ� ��ġ ���� - ��� �߾�
		locationX = BoardWidth / 2 + 1;
		locationY = BoardHeight - 1 + pieceShape.minY();
		System.out.println(pieceShape.getShape()+" : create location x : " + locationX + " y : "
				+ locationY);

		if (!tryMove(pieceShape, locationX, locationY)) {
			pieceShape.setShape(TetrisBlocks.NoShape);
			timer.stop();
			isStarted = false;
			statusbar.setText("game over");
			System.out.println("game over");
		}
	}
	/**
	 * ��� �̵� �õ�
	 * @param newPiece
	 * @param newX
	 * @param newY
	 * @return ������ ���� ��� true, ���� �߻��� false
	 */
	private boolean tryMove(BoxsShape newPiece, int newX, int newY) {
		for (int i = 0; i < 4; ++i) {
			int x = newX + newPiece.getX(i);
			int y = newY - newPiece.getY(i);
			System.out.println(newX+" "+newPiece.getX(i)+" "+newY+" "+newPiece.getY(i));
			// ��Ʈ���� �ʵ带 ����� �� Ȯ��
			if (x < 0 || x >= BoardWidth || y < 0 || y >= BoardHeight) {
				System.err.println("�ʵ� x : "+ x +" y : " + y);
				return false;
			}

			// �ٸ� ��Ʈ���� ��ϰ� �浹�ϴ� �� Ȯ��
			if (shapeAt(x, y) != TetrisBlocks.NoShape) {
				System.out.println("���");
				return false;
			}
		}

		pieceShape = newPiece;
		locationX = newX;
		locationY = newY;
		repaint();
		return true;
	}
	/**
	 * board���� �ϳ��� ������ �� ���ִ� ������ �����Ѵ�.
	 */
	private void removeFullLines() {
		int countFullLines = 0; // �� �޼ҵ� ������ �����ϴ� ������ ��

		for (int i = BoardHeight - 1; i >= 0; --i) {
			boolean lineIsFull = true;// ���ο� ���� ����

			// �ش��ϴ� ���ο��� �ϳ��� �� ����� �ִ��� Ȯ��
			for (int j = 0; j < BoardWidth; ++j) {
				if (shapeAt(j, i) == TetrisBlocks.NoShape) {
					lineIsFull = false;
					break;
				}
			}

			if (lineIsFull) {
				++countFullLines;
				// ������ ���� ���� ����� �Ʒ��� �̵�
				for (int k = i; k < BoardHeight - 1; ++k) {
					for (int j = 0; j < BoardWidth; ++j) {
						board[(k * BoardWidth) + j] = shapeAt(j, k + 1);
					}
				}
			}
		}

		if (countFullLines > 0) {
			countLinesRemoved += countFullLines;
			statusbar.setText("score : " + countLinesRemoved);
			isFallingFinised = true;
			pieceShape.setShape(TetrisBlocks.NoShape);
			repaint();
		}

	}
	/**
	 * ����� �׷��ִ� �Լ�
	 * 
	 * @param g
	 * @param x
	 * @param y
	 * @param shape
	 */
	private void drawSquare(Graphics g, int x, int y, TetrisBlocks shape) {
		// �� ���� ���� ���� ��ġ�� �ش��ϴ� ���� ���� ���ǵǾ� �ִ�.
		Color colors[] = { new Color(0, 0, 0), new Color(204, 102, 102),
				new Color(102, 204, 102), new Color(102, 102, 204),
				new Color(204, 204, 102), new Color(204, 102, 204),
				new Color(102, 204, 204), new Color(218, 170, 0) };

		// ���õ� ����� �÷� ��������
		Color color = colors[shape.ordinal()];

		// �簢���� ����
		g.setColor(color);
		g.fillRect(x + 1, y + 1, squareWidth() - 2, squareHeight() - 2);

		// �簢���� �ܺ� ���, ����
		g.setColor(color.brighter());
		g.drawLine(x, y + squareHeight() - 1, x, y); // ���� ��
		g.drawLine(x, y, x + squareWidth() - 1, y); // ��� ��

		// �簢���� �ܺ� �ϴ�, ������
		g.setColor(color.darker());
		g.drawLine(x + 1, y + squareHeight() - 1, x + squareWidth() - 1, y
				+ squareHeight() - 1);// �ϴ�
		g.drawLine(x + squareWidth() - 1, y + squareHeight() - 1, x
				+ squareWidth() - 1, y + 1);// ������
	}
	/**
	 * Ű �Է¿� ���� ó���� �ϴ� Ŭ����
	 */
	class TetrisKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);

			if (!isStarted || pieceShape.getShape() == TetrisBlocks.NoShape) {
				return;
			}

			int keycode = e.getKeyCode();

			if (keycode == 'p' || keycode == 'P') {
				pause();
				return;
			}

			if (isPaused)
				return;

			switch (keycode) {
			case KeyEvent.VK_LEFT:
				tryMove(pieceShape, locationX - 1, locationY);
				break;
			case KeyEvent.VK_RIGHT:
				tryMove(pieceShape, locationX + 1, locationY);
				break;
			case KeyEvent.VK_DOWN:
				tryMove(pieceShape.rotateRight(), locationX, locationY);
				break;
			case KeyEvent.VK_UP:
				tryMove(pieceShape.rotateLeft(), locationX, locationY);
				break;
			case KeyEvent.VK_SPACE:
				dropDown();
				break;
			case 'd':
				oneLineDown();
				break;
			case 'D':
				oneLineDown();
				break;
			}
		}
	}

}