package mission;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton bt = new JButton("버튼");
	private JButton bt2 = new JButton("버튼2");
	private JPanel pan = new JPanel();

	public MyFrame() {
		// setLayout(new FlowLayout());

		bt.addActionListener(new ActionListener() { // 무명 클래스

			@Override
			public void actionPerformed(ActionEvent e) {
				bt.setText("버튼2");
				bt.setBackground(Color.green);
				pan.setBackground(Color.BLUE);

			}
		}); // 액션 등록

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bt2.setText("버튼1");
				bt2.setBackground(Color.gray);
				pan.setBackground(Color.red);
			}
		});

		add(bt);
		add(bt2);
		add(pan);
		pan.add(bt);
		pan.add(bt2);

		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pan.setBackground(Color.blue);

	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

	public class MyListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			bt.setText("버튼3");
			bt2.setText("버튼4");
			bt.setBackground(Color.blue);
			bt2.setBackground(Color.ORANGE);
			// pan.setBackground(Color.gray);
			// if (e.getSource() == bt) {
			// pan.setBackground(Color.blue);
			// if (e.getSource() == bt2) {
			// pan.setBackground(Color.red);
			// }
			// }
			//
		}
	}
}