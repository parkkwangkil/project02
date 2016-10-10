package programming03;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JPanel pan1 = new JPanel();
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();

	private JTextField text = new JTextField(25);

	private JLabel labels = new JLabel();
	private JLabel labels2 = new JLabel();
	private JLabel labels3 = new JLabel();
	private JButton button = new JButton();
	private JButton[] buttons = new JButton[25];
	private JButton cbutton = new JButton("C");
	private JButton pbutton = new JButton("+");
	private JButton mbutton = new JButton("-");
	private JButton gbutton = new JButton("*");
	private JButton dbutton = new JButton("/");
	private JButton ebutton = new JButton("=");

	public MyFrame() {
		MyListner listner = new MyListner();

		/////////////////////////////////////////
		setSize(350, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("°è»ê±â");
		setVisible(true);
		///////////////////////////
		setLayout(new FlowLayout(FlowLayout.LEFT));
		pan1.setLayout(new GridLayout(1, 2, 5, 8));
		pan2.setLayout(new GridLayout(2, 3, 6, 9));
		pan3.setLayout(new GridLayout(3, 4, 7, 0));
		pan1.add(text);
		pan1.add(labels);
		pan1.add(pan2);
		pan1.add(pan3);
		pan1.add(labels2);
		pan1.add(labels3);
		pan1.add(cbutton);
		pan1.add(pbutton);
		pan1.add(mbutton);
		pan1.add(gbutton);
		pan1.add(ebutton);
		pan1.add(gbutton);
		pan1.add(cbutton);
		pan1.add(button);
		pan2.add(labels);
		pan2.add(cbutton);
		pan2.add(cbutton);
		pan2.add(pbutton);
		pan2.add(mbutton);
		pan2.add(gbutton);
		pan2.add(ebutton);
		pan2.add(gbutton);
		pan2.add(cbutton);
		pan3.add(cbutton);
		pan3.add(pbutton);
		pan3.add(mbutton);
		pan3.add(gbutton);
		pan3.add(ebutton);
		pan3.add(gbutton);
		pan3.add(cbutton);

		/////////////////////////////////////////
		add(pan1);
		add(pan2);
		add(pan3);
		add(labels);
		// add(button);

		////////////////////////////////////////
		String[] bt = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "=", "+", "-", "*", "/" };
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(bt[i]);
			buttons[i].addActionListener(listner);
			pan3.add(buttons[i]);

		}

	}

	public class MyListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < buttons.length; i++) {
				if (e.getSource() == buttons[i]) {

					if (text.getText().equals("0")) {
						text.setText("" + i);

					} else {
						if (labels.getText().equals("0")) {
							text.setText(text.getText() + i);

						} else {
							if (labels.getText().equals("0")) {
								text.setText(text.getText() + i);
							} else {
								if (labels3.getText().equals("")) {
									text.setText("" + i);
									labels2.setText("");
								} else {
									text.setText(text.getText() + i);
								}
							}
						}

						if (e.getSource() == ebutton) {
							double n1 = 0, n2 = 0, result = 0;
							if (labels.getText().equals("+")) {
								result = n1 + n2;
								text.setText("" + result);
							}
							if (labels.getText().equals("-")) {
								result = n1 - n2;
								text.setText("" + result);
							}
							if (labels.getText().equals("*")) {
								result = n1 * n2;
								text.setText("" + result);
							}
							if (labels.getText().equals("/")) {
								result = n1 / n2;
								text.setText("" + result);
							}
							if (labels.getText().equals("=")) {
								result = result;
								text.setText("" + result);
							}

						}

					}
					if (e.getSource() == ebutton) {
						double n1 = 0, n2 = 0, result;
						if (labels2.getText().equals("+")) {
							result = n1 + n2;
							text.setText("" + result);
						}
						if (labels2.getText().equals("-")) {
							result = n1 - n2;
							text.setText("" + result);
						}
						if (labels2.getText().equals("*")) {
							result = n1 * n2;
							text.setText("" + result);
						}
						if (labels2.getText().equals("/")) {
							result = n1 / n2;
							text.setText("" + result);
						}
					}
					if (e.getSource() == ebutton) {
						double n1 = 0, n2 = 0, result;
						if (labels3.getText().equals("+")) {
							result = n1 + n2;
							text.setText("" + result);
						}
						if (labels3.getText().equals("-")) {
							result = n1 - n2;
							text.setText("" + result);
						}
						if (labels3.getText().equals("*")) {
							result = n1 * n2;
							text.setText("" + result);
						}
						if (labels3.getText().equals("/")) {
							result = n1 / n2;
							text.setText("" + result);
						}

						if (e.getSource() == pbutton) {
							labels.setText(text.getText());
							labels2.setText("+");
							labels3.setText("");
						}
						if (e.getSource() == mbutton) {
							labels.setText(text.getText());
							labels2.setText("-");
							labels3.setText("");
						}
						if (e.getSource() == gbutton) {
							labels.setText(text.getText());
							labels2.setText("*");
							labels3.setText("");

						}
						if (e.getSource() == dbutton) {
							labels.setText(text.getText());
							labels2.setText("/");
							labels3.setText("");
						}
						if (e.getSource() == cbutton) {
							text.setText("close");
							labels.setText("close");
							labels2.setText("");
							labels3.setText("");
						}
					}
				}
			}
		}
	}
}
		

