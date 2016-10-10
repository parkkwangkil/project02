package work01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.openmbean.SimpleType;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Dialog extends JFrame implements ActionListener{

	private JPanel pan;
	private JButton b1,b2;
	private SimpleType dialog;
	
	public Dialog(){
		pan = new JPanel();
		add(pan, "Center");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
