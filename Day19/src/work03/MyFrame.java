package work03;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	
	public MyFrame(){
		setSize(240, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("COLOR TEST");
		setVisible(true);
		JPanel panel = new MyPanel();
		add(panel);
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
