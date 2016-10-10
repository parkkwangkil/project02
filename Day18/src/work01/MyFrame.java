package work01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	 JTextArea area = new JTextArea();
	 JTextField field = new JTextField();

	MyFrame() {

		field.addActionListener(new MyListner());
		
		 area.setEditable(false);
		 field.setBackground(Color.yellow);

		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		add(new JScrollPane(area), BorderLayout.CENTER);
		add(field, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();

	}

	public class MyListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			area.append(field.getText() + "\n");
			field.setText("");

		}
	}
}
