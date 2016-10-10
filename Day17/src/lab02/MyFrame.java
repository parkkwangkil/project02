package lab02;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	JPanel p1;
	JPanel p2;
	JPanel p3;
	public MyFrame(){
		setSize(300, 200);
		setTitle("MyFrame");
		p1 = new JPanel();
		p1.setLayout(new GridLayout(3, 4));
//		p2 = new JPanel();
//		p2.setLayout(new GridLayout(0, 5));
//		p3 = new JPanel();
//		p3.setLayout(new GridLayout(0, 2));
		for (int i=0; i<=10; i++)
			p1.add(new JButton("Button"+i));
		add(p1);
		setVisible(true);
		
		
		
		
		
	}

}
