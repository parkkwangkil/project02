package work02;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.orange);
		g.fillOval(20, 30, 200, 200);

		g.setColor(Color.blue);
		g.drawArc(60, 80, 50, 50, 180, -180);
		g.drawArc(150, 80, 50, 50, 180, -180);
		g.drawArc(70, 80, 100, 70, 180, 180);

}
}