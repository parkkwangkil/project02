package work03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton bt = new JButton("버튼");

	public MyFrame() {
		setLayout(new FlowLayout());

		bt.addActionListener(new ActionListener() { // 무명 클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bt.setText("난 안드로이드가 싫어요!!!!!!");
				
			}
		}); // 액션 등록

		add(bt);
		
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

	public class MyListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			bt.setText("또 속냐");

		}

	}
}
