package work06;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn01 = new JButton("버튼1");
	private JButton btn02 = new JButton("버튼2");
	private JButton btn03 = new JButton("버튼3");
	private JButton btn04 = new JButton("버튼4");
	private JButton btn05 = new JButton("버튼5");
	
	public MyFrame(){
		add(btn01, BorderLayout.NORTH);
		add(btn02, BorderLayout.EAST);
		add(btn03, BorderLayout.SOUTH);
		add(btn04, BorderLayout.NORTH);
		add(btn05, BorderLayout.CENTER);
		
		setSize(300, 200);
		setTitle("6번째제몫");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
