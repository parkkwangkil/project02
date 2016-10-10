package work05;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	 JPanel panel = new JPanel();
	 JButton btn = new JButton("인쪽");
	 JButton btn2 = new JButton("중앙");
	 JButton btn3 = new JButton("오른쪽");

	public MyFrame() {
		btn3.setEnabled(false);
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		add(panel);
		setResizable(false);
		setSize(300, 200);
		setTitle("5번째 제목");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
