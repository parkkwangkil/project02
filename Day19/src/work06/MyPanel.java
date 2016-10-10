package work06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private boolean isSeleted = false;
	private BufferedImage img = null;
	private int x = 10, y = 10;
	public int size;

	public MyPanel() {
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		requestFocus();
		setFocusable(true);

		try {
			img = ImageIO.read(new File("spitz.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, x, y, null);

		g.setColor(new Color(100, 150, 250));
		g.fillRect(x, y, 100, 100);

	}

	class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			if (isSeleted) {
				x = e.getX() - (size / 2);
				y = e.getY() - (size / 2);
				repaint();
			}

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			int mouseX = e.getX() - (size / 2);
			int mouseY = e.getY() - (size / 2);

			if ((x <= mouseX && mouseX <= (x + size)) && (y <= mouseY && mouseY <= (y + size))) {
				isSeleted = true;
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {

			if (isSeleted) {
				isSeleted = false;
				int mouseX = e.getX() - (size / 2);
				int mouseY = e.getY() - (size / 2);

				repaint();
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
