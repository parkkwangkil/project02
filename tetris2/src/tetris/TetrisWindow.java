package tetris;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TetrisWindow extends JFrame {

	JLabel statusbar;

	public TetrisWindow() {
		statusbar = new JLabel("tetris"); // ���� ����
		add(statusbar, BorderLayout.SOUTH); // �� ���� �� ��ġ ����

		GameBoard board = new GameBoard(this);
		add(board);
		board.start(); // ���� ����
		System.out.println("add window and start game");
		
		//JPanel back = new JPanel();//��� �г�
		//add(back);
		
		setSize(300, 500); // ��ü â ũ�� ����
		setResizable(false); // â ũ�� ����
		setTitle("Tetris!"); // Ÿ��Ʋ ����
		setDefaultCloseOperation(EXIT_ON_CLOSE); //���� ��ư ����
	}

	public static void main(String[] args) {
		TetrisWindow tetrisWindow = new TetrisWindow();
		tetrisWindow.setLocationRelativeTo(null); // ����� ȭ�� �߾ӿ� ��ġ
		tetrisWindow.setVisible(true); // show ��ɾ� ��� ����Ѵ�.
		System.out.println("show window");
	}

	/**
	 * �� ��ü���� �����ϴ� ���� ��ȯ�Ѵ�. - ���� ���� ����, ���� �������� ǥ���Ͽ� �ִ� ��Ȱ�� �ϰ� �ִ�.
	 * @return JLabel
	 */
	public JLabel getStatusbar() {
		return statusbar;
	}

}