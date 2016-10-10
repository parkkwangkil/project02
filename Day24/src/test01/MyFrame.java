package test01;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private Panel p = new Panel();

	public MyFrame() {
		setSize(10, 20);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		add(p);
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
