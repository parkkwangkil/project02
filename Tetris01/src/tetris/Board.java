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

import team_project.BlockGUI.Tetro;

public class Board extends JPanel implements ActionListener {
	
	
	int boardwidth = 10; // ������ ����
	int boardheight = 10; // ������ ����

	boolean isFallingFinised = false; // ����� ���������� Ȯ��
	boolean isStarted = false; // ����
	boolean isPaused = false; // ���� ��û

	int locationX = 0; // ����� x ��
	int locationY = 0; // ����� y��
	Block pieceShape; // ���� ��Ʈ������ ����
	Block[] board; // ����� ��ġ�� � ������ Ȯ��

	private int blocks[][]; // ��Ʈ������ ����� ��ǥ[][][]
	private int blockTable[][][]; // ��Ʈ���� ���̺��� ��ǥ [][][]

	int countLinesRemoved = 0; // ������ ���μ�
	JLabel statusbar;

	public Board() {
		setFocusable(true); // �� ��ü�� �����ϴ� â�� ��Ŀ���� ������.
		pieceShape = new Block();
		board = new Block[boardwidth * boardheight];
		 addKeyListener(new TetrisKeyListener()); // Ű�� ��� 
		 clearBoard(); // ���� �ʱ�ȭ
	}

	@Override // ���ۿ� ���� �׼�
	public void actionPerformed(ActionEvent e) {
		if (isFallingFinised) {
			isFallingFinised = false;
			newPiece();
		} else {
			oneLineDown();
		}
	}

	int squareWidth() { // ����� ���� ����
		return (int) getSize().getWidth() / boardwidth;
	}

	int squareHeight() { // ����� ���� ����
		return (int) getSize().getHeight() / boardheight;
	}

	Block shapeAt(int x, int y) {
		return board[(y * boardwidth) + x];
	}





	private void pieceDropped() {
		for (int i = 0; i < 4; ++i) { // ��Ʈ���� ����� 4���� ������� �̷���� �ִ�.
			int x = locationX + pieceShape.getX(i);
			int y = locationY - pieceShape.getY(i);
			board[(y * boardwidth) + x] = pieceShape.getShape();
			System.out.println("add : " + ((y * boardwidth) + x) + " shape : " + pieceShape.getShape());
		}

		removeFullLines();

		if (!isFallingFinised) {// ���� ����� ���� �̴�.
			newPiece();
		}
	}

	private void removeFullLines() {
		int countFullLines = 0; // �� �޼ҵ� ������ �����ϴ� ������ ��

		for (int i = boardheight - 1; i >= 0; --i) {
			boolean lineIsFull = true;// ���ο� ���� ����

			// �ش��ϴ� ���ο��� �ϳ��� �� ����� �ִ��� Ȯ��
			for (int j = 0; j < boardwidth; ++j) {
				if (shapeAt(j, i) == Block.NoShape) {
					lineIsFull = false;
					break;
				}
			}

			if (lineIsFull) {
				++countFullLines;
				// ������ ���� ���� ����� �Ʒ��� �̵�
				for (int k = i; k < boardheight - 1; ++k) {
					for (int j = 0; j < boardwidth; ++j) {
						board[(k * boardwidth) + j] = shapeAt(j, k + 1);
					}
				}
			}
		}

		if (countFullLines > 0) {
			countLinesRemoved += countFullLines;
			statusbar.setText("score : " + countLinesRemoved);
			isFallingFinised = true;
			pieceShape.setShape(Block.NoShape);
			repaint();
		}

	}

	private boolean tryMove(Block newPiece, int newX, int newY) {
		for (int i = 0; i < 4; ++i) {
			int x = newX + newPiece.getX(i);
			int y = newY - newPiece.getY(i);
			System.out.println(newX + " " + newPiece.getX(i) + " " + newY + " " + newPiece.getY(i));
			// ��Ʈ���� �ʵ带 ����� �� Ȯ��
			if (x < 0 || x >= boardwidth || y < 0 || y >= boardheight) {
				System.err.println("�ʵ� x : " + x + " y : " + y);
				return false;
			}

			// �ٸ� ��Ʈ���� ��ϰ� �浹�ϴ� �� Ȯ��
			if (shapeAt(x, y) != Block.NoShape) {
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

	private void clearBoard() {
		for (int i = 0; i < boardheight * boardwidth; i++) {
			board[i] = Block.NoShape;
		}
	}

	private void newPiece() {
		pieceShape.setRandomShape();

		// ����� �����Ǵ� ��ġ ���� - ��� �߾�
		locationX = boardwidth / 2 + 1;
		locationY = boardheight - 1 + pieceShape.minY();
		System.out.println(pieceShape.getShape() + " : create location x : " + locationX + " y : " + locationY);

		if (!tryMove(pieceShape, locationX, locationY)) {
			pieceShape.setShape(Block.NoShape);
			isStarted = false;
			statusbar.setText("game over");
			System.out.println("game over");
		}
	}

	private void oneLineDown() {
		if (!tryMove(pieceShape, locationX, locationY - 1)) {
			pieceDropped();
		}
	}

	

	class TetrisKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);

			if (!isStarted || pieceShape.getShape() == Block.NoShape) {
				return;
			}

			int keycode = e.getKeyCode();

			if (keycode == 'p' || keycode == 'P') {
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



	public void start() {
		// TODO Auto-generated method stub
		
	}

}
