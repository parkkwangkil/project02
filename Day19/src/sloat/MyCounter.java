package sloat;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame implements ActionListener {
	private JLabel[] labels;
	private JButton button;
	private int[] number;
	
	public MyCounter(){
		setSize(500, 300);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		labels = new JLabel[3];
		number = new int[3];
		
		for(int i=0; i<3; i++){
			labels[i] = new JLabel(""+number[i]);
			labels[i].setFont(new Font("serif", Font.BOLD| Font.ITALIC, 100));
			labels[i].setSize(100, 100);
			labels[i].setLocation(100+100*i,20);
			panel.add(labels[i]);
			
		}
		button = new JButton("½ºÇÉ");
		button.setSize(250, 50);
		button.setLocation(100,150);
		panel.add(button);
		button.addActionListener(this);
		
		add(panel);
		setTitle("mygame");
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i=0; i<3; i++){
			number[i]= (int) (Math.random() *10);
			labels[i].setText(""+number[i]);
		}
		
	}
	

}
