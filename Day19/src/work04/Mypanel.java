package work04;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mypanel extends JPanel {

	Font f1, f2, f3, f4, f5;

	public Mypanel() {
		f1 = new Font("Serif", Font.PLAIN, 20);
		f2 = new Font("San Serif", Font.BOLD, 20);
		f3 = new Font("Monospaced", Font.ITALIC, 20);
		f4 = new Font("Dialog", Font.BOLD | Font.ITALIC, 20);
		f5 = new Font("DialogInput", Font.BOLD, 20);
	}

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setFont(f1);
		g.drawString("Serif 20 points PLAIN", 10, 50);
		g.setFont(f2);
		g.drawString("San Serif 20 points BOLD", 10, 70);
		g.setFont(f3);
		g.drawString("Monospaced 20 points ITALIC", 10, 90);
		g.setFont(f4);
		g.drawString("Dialog 20 points BOLD + ITALIC", 10, 110);
		g.setFont(f5);
		g.drawString("DialogInput 20 points BOLD", 10, 130);

	}

}
