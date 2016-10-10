package test04;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDown extends JFrame {
	private JLabel label;

	class MyThread extends Thread {
		public void run() {
			for (int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i + "");
			}
		}
	}

	public CountDown() {
		setTitle("카운트다운");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel("start");
		label.setFont(new Font("serif", Font.BOLD, 100));
		add(label);
		(new MyThread()).start();
		setVisible(true);
	}

	public static void main(String[] args) {
		CountDown t = new CountDown();
	}

}
