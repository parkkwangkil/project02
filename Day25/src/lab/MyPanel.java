package lab;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {
	Emermy enermy;
	SpaceShip spaceship;
	Missile missile;

	public MyPanel() {
		super();
		this.addKeyListener(this);
		this.requestFocus();
		setFocusable(true);
		enermy = new Emermy("enermy.png");
		spaceship = new SpaceShip("spaceship.png");
		missile = new Missile("missile.png");

		class MyThread extends Thread {
			public void run() {
				while (true) {
					enermy.update();
					spaceship.update();
					missile.update();
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {}
				}
			}
		}

		Thread t = new MyThread();
		t.start();
	}

	public void paint(Graphics g) {
		super.paint(g);
		enermy.draw(g);
		spaceship.draw(g);
		missile.draw(g);
	}

	public void keyPressed(KeyEvent event) {
		spaceship.keyPressed(event);
		missile.keyPressed(event, spaceship.x, spaceship.y);
	}

	public void keyReleased(KeyEvent arg0){}
	public void keyTyped(KeyEvent arg0){}
	}

	


