package programming03;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	JButton button = new JButton();
	JTextField text = new JTextField(25);
	public MyFrame() {
		

		/////////////////////////////////////////
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("°è»ê±â");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		pan1.setLayout(new GridLayout(2, 1, 5, 5));
		pan2.setLayout(new GridLayout(1, 1, 5, 5));
		pan3.setLayout(new GridLayout(4, 4, 5, 5));
		pan1.add(text);
		pan2.add(button);

		/////////////////////////////////////////
		add(pan1);
		add(pan2);
		add(pan3);
		////////////////////////////////////////
		String[] bt = { "C", "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "=", "+" };
		JButton[] buttons = new JButton[16];
		for (int i = 0; i < bt.length; i++) {
			buttons[i] = new JButton(bt[i]);
			pan3.add(buttons[i]);
		}

	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
