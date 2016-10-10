package work01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	private JButton bt = new JButton("버튼");

	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());

		////// 액션 체러기 생성 및 등록

		MyListner listner = new MyListner(); // 액션 생성
		bt.addActionListener(listner); // 액션 등록

		add(bt);

	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

	public class MyListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			bt.setText("고고고");

		}

	}
}
