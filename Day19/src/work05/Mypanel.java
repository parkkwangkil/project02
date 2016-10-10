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
			// press를 먼저 할 때 사각형을 선택했는지 검사.
			if (isSeleted) {
				x = e.getX()-(size/2);
				y = e.getY()-(size/2);
				// 현재 마우스가 움직이는 위치로 사각형 다시그리게 함
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
			// press를 먼저 할 때 사각형을 선택했는지 검사.
			if (isSeleted) {
				isSeleted = false;// 사각형 이동 끝났음.
				int mouseX = e.getX()-(size/2);
				int mouseY = e.getY()-(size/2);
				// 현재 마우스가 움직이는 위치로 사각형 다시그리게 함
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