package work05;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	 JPanel panel = new JPanel();
	 JButton btn = new JButton("����");
	 JButton btn2 = new JButton("�߾�");
	 JButton btn3 = new JButton("������");

	public MyFrame() {
		btn3.setEnabled(false);
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		add(panel);
		setResizable(false);
		setSize(300, 200);
		setTitle("5��° ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
