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
		JTextField text3 = new JTextField("���ڴ� �� 7.5���� �Դϴ�.");
		JButton button = new JButton("��ȯ");
		JLabel label = new JLabel("������ �Է��ϼ���");
		JLabel label2 = new JLabel("���ڸ� �Է��ϼ���");
		public MyFrame() {	
		/////////////////////////////////////////
		setSize(300	, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� ����");
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
