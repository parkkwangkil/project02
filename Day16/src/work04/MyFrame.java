package work04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame  extends JFrame {
	private JPanel panel = new JPanel();
	private JButton btn = new JButton("버튼");
	private JButton btn2 = new JButton("버튼2");
	private JLabel lb = new JLabel("레이블");
	
	public MyFrame(){
		setLayout(new FlowLayout());
		
		panel.setSize(150, 150);
		panel.setBackground(Color.RED);
		panel.add(btn);
		panel.add(btn2);
		panel.add(lb);
		
		add(panel);
		setResizable(false);
		setSize(300,200);
        setTitle("네번째 제목");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
	}

}
