package exercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame5 extends JFrame {
	private JButton button = new JButton("버튼");

	public MyFrame5() {
		button.addActionListener(new ActionListener() {
	

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("마침내 버튼이 눌러졌습니다.");
			}
		});

	}

}
