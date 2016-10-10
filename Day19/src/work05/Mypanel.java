package work05;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Mypanel extends JPanel {
	private int x = 10, y = 10, size = 50;
	private boolean isSeleted = false;

	public Mypanel() {
        MyMouseListener listener = new MyMouseListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
         
        requestFocus();
        setFocusable(true);
    }

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(new Color(100, 150, 250));
		g.fillRect(x, y, size, size);
	}

	class MyMouseListener implements MouseListener, MouseMotionListener {
		@Override
		public void mouseDragged(MouseEvent e) {
			// press�� ���� �� �� �簢���� �����ߴ��� �˻�.
			if (isSeleted) {
				x = e.getX()-(size/2);
				y = e.getY()-(size/2);
				// ���� ���콺�� �����̴� ��ġ�� �簢�� �ٽñ׸��� ��
				repaint();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int mouseX = e.getX()-(size/2);
			int mouseY = e.getY()-(size/2);

			if ((x <= mouseX && mouseX <= (x + size)) && (y <= mouseY && mouseY <= (y + size))) {
				isSeleted = true;
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// press�� ���� �� �� �簢���� �����ߴ��� �˻�.
			if (isSeleted) {
				isSeleted = false;// �簢�� �̵� ������.
				int mouseX = e.getX()-(size/2);
				int mouseY = e.getY()-(size/2);
				// ���� ���콺�� �����̴� ��ġ�� �簢�� �ٽñ׸��� ��
				repaint();
			}
		}

		////////////////////////////////////////////////////////////////
		@Override
		public void mouseMoved(MouseEvent e) {
		}

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

	}

}