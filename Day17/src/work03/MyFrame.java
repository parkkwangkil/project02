package work03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton bt = new JButton("��ư");

	public MyFrame() {
		setLayout(new FlowLayout());

		bt.addActionListener(new ActionListener() { // ���� Ŭ����
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bt.setText("�� �ȵ���̵尡 �Ⱦ��!!!!!!");
				
			}
		}); // �׼� ���

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
			bt.setText("�� �ӳ�");

		}

	}
}
