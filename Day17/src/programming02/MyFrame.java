package programming02;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame  extends JFrame{
	
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		JTextField text = new JTextField("1000");
		JTextField text2 = new JTextField("7.5");
		JTextField text3 = new JTextField("이자는 연 7.5만원 입니다.");
		JButton button = new JButton("변환");
		JLabel label = new JLabel("원금을 입력하세요");
		JLabel label2 = new JLabel("이자를 입력하세요");
		public MyFrame() {	
		/////////////////////////////////////////
		setSize(300	, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자 계산기");
		setVisible(true);
		button.setBackground(Color.orange);
		/////////////////////////////////////////
		add(pan1);
		pan1.add(label);
		pan1.add(text);
		pan1.add(label2);
		pan1.add(text2);
		pan1.add(button);
		pan1.add(text3);
	}



public static void main(String[] args) {
	MyFrame f = new MyFrame();
}
}
