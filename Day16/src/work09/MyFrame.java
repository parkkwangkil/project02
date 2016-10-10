package work09;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton b1 = new JButton("버튼1");
	private JButton b2 = new JButton("버튼2");
	private JButton b3 = new JButton("버튼3");
	
	public MyFrame(){
		setLayout(null);
		add(b1);
		add(b2);
		add(b3);
		
		b1.setBounds(0, 0, 100, 50);
		b2.setBounds(110, 1, 100, 100);
		b3.setBounds(220, 50, 200, 150);
		
		
		setSize(300, 200);
		setTitle("9번째");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
public static void main(String[] args) {
	MyFrame f = new MyFrame();
}
}
