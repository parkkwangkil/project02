package change;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	private JLabel label = new JLabel();

	MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		add(label);

		////////////////////////////////////////

		label = new JLabel("don't cry before you are hurt");
		label.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 30));
		label.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				if (e.getSource() == label) {
				} else {

				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

				label.setText("다치기도 전에 울지마라");

			}
		});

	}
}
