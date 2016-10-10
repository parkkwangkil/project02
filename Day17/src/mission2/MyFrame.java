package mission2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	 JButton bt = new JButton("업 ");
	 JButton bt2 = new JButton("다운");
	 JPanel pan = new JPanel();
	 JPanel pan2 = new JPanel();
	 JLabel label = new JLabel("0");

	public MyFrame() {

		bt.addActionListener(new ActionListener() { // 무명 클래스

			@Override
			public void actionPerformed(ActionEvent e) {
				bt.setText("울려,");
				bt.setBackground(Color.red);
				label.setText(String.valueOf(Integer.parseInt(label.getText()) + 1));
			

			}
		}); // 액션 등록

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				bt2.setText("내려");
				bt2.setBackground(Color.green);
				label.setText("0");
				
			}
		});

		add(bt, BorderLayout.SOUTH);
		add(bt2, BorderLayout.SOUTH);
		add(pan , BorderLayout.SOUTH);
		add(pan2, BorderLayout.CENTER);
		pan.add(bt, BorderLayout.SOUTH);
		pan.add(bt2,  BorderLayout.CENTER);
		add(label);

		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
//		pan.setBackground(Color.blue);
		
			
		}


	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

	public class MyListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		
		}
	}
}