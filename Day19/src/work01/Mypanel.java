package work01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Mypanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g); // 비어 있는 판 그리기는 지우지 않음 
		g.drawLine(10, 10, 50, 50);
		g.drawRect(10, 70, 40, 50);
		g.drawOval(10, 12, 40, 30);
		g.fillRect(10, 170, 40, 30);
		
		g.setColor(Color.orange);
		g.fillRect(10, 170, 40, 30);
		
		g.setColor(Color.blue);
		g.drawArc(10, 50, 80, 50, 0, 60);

	}

}
