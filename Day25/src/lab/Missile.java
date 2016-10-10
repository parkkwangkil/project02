package lab;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Missile extends GraphicObject {
	boolean launched = false;

	public Missile(String name) {
		super(name);
		y = -200;
	}

	public void update() {
		if (launched)
			y -= 1;
		if (y < -100)
			launched = false;
	}

	public void keyPressed(KeyEvent event, int x, int y) {
		if (event.getKeyCode() == KeyEvent.VK_SPACE) {
			launched = true;
			this.x = x;
			this.y = y;
		}

	}
}
