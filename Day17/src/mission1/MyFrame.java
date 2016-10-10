package mission1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import work01.MyFrame.MyListner;

public class MyFrame extends JFrame {
	private JButton bt = new JButton("버튼1");
	private JButton bt2 = new JButton("버튼2");
	private JPanel pan = new JPanel();

	public MyFrame() {
		bt.addActionListener(new BtListener());
		bt2.addActionListener(new Bt2Listener());

		pan.add(bt);
		pan.add(bt2);

		add(pan);

		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

	class BtListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			bt.setBackground(Color.darkGray);
			pan.setBackground(Color.red);
		}
	}

	class Bt2Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			bt2.setBackground(Color.lightGray);
			pan.setBackground(Color.blue);
		}
	}
}