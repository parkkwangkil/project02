package programming01;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
	Box box;
	public MyFrame() {

		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		JTextField text = new JTextField(1);
		JTextField text2 = new JTextField("1������ 1.6 ų�ι��� �Դϴ�.");
		JButton button = new JButton("��ȯ");
		JLabel label = new JLabel("�Ÿ��� ���� ������ �Է��ϼ���");
		
		/////////////////////////////////////////
		setSize(300	, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("������ ų�ι��ͷ� ��ȯ");
		setVisible(true);
		/////////////////////////////////////////
		add(pan1);
		pan1.add(label);
		pan1.add(text);
		pan1.add(button);
		pan1.add(text2);
	}
	

		/////////////////////////////////////////
	
	/////////////////////////////////////////

	public static void main(String[] args) {
	MyFrame f = new MyFrame();

}
}	