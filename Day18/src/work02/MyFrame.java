package work02;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JTextField tf = new JFormattedTextField(50);

	public MyFrame() {
		tf.addKeyListener(new MyKeyListner());
		setLayout(new FlowLayout());
		add(tf);

		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

	class MyKeyListner implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("눌러:" + e.getKeyCode() + "/" + e.getKeyChar() + "/" + e.isControlDown());

		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("꺼라:" + e.getKeyCode() + "/" + e.getKeyChar() + "/" + e.isControlDown());

		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("쳐라:" + e.getKeyCode() + "/" + e.getKeyChar() + "/" + e.isControlDown());

		}

	}

}
