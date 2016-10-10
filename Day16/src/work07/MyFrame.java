package work07;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton btn01 = new JButton("버튼1");
	private JButton btn02 = new JButton("버튼2");
	private JButton btn03 = new JButton("버튼3");
	private JButton btn04 = new JButton("버튼4");
	private JButton btn05 = new JButton("버튼5");
	
	private JPanel panel = new JPanel();
	private JPanel panel2 = new JPanel();
	
	public MyFrame(){
//		add(btn01, BorderLayout.NORTH);
//		add(btn02, BorderLayout.EAST);
//		add(btn03, BorderLayout.SOUTH);
//		add(btn04, BorderLayout.NORTH);
//		add(btn05, BorderLayout.CENTER);
		panel.add(btn01);
		panel.add(btn02);
		panel.add(btn03);
		panel.add(btn04);
		panel.add(btn05);
		
		add(panel,BorderLayout.CENTER);
		add(panel2,BorderLayout.SOUTH);
		panel.setBackground(Color.gray);
		panel.setBackground(Color.red);
		
		
		setSize(300, 200);
		setTitle("7번째제몫");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}


