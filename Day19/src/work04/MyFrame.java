package work04;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	public MyFrame(){
		setSize(240, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("FONT TEST");
		setVisible(true);
		JPanel panel = new JPanel();
		add(panel);
		
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	

}
