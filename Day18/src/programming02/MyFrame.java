package programming02;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JTextField text = new JTextField("1000");
	JTextField text2 = new JTextField("7.5");
	JTextField text3 = new JTextField("���ڴ� �� 7.5���� �Դϴ�.");
	JButton button = new JButton("��ȯ");
	JLabel label = new JLabel("������ �Է��ϼ���");
	JLabel label2 = new JLabel("���ڸ� �Է��ϼ���");

	public MyFrame() {
		MyListner listner = new MyListner();

		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� ����");
		setVisible(true);
		button.setBackground(Color.orange);
		/////////////////////////////////////////
		add(pan1);
		pan1.add(label);
		pan1.add(text);
		pan1.add(label2);
		pan1.add(text2);
		pan1.add(button);
		pan1.add(text3);
		button.addActionListener(listner);
	}

	public class MyListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				String str = text.getText();
				double wongum = Integer.parseInt(str);
				String eik = text2.getText();
				double gain = Float.parseFloat(eik);
				double eja = wongum * gain / 100;
				text3.setText(String.format("���ڴ� �� " + (int) eja + "�����Դϴ�."));

			}
		}

	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}