package work04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame  extends JFrame {
	private JPanel panel = new JPanel();
	private JButton btn = new JButton("��ư");
	private JButton btn2 = new JButton("��ư2");
	private JLabel lb = new JLabel("���̺�");
	
	public MyFrame(){
		setLayout(new FlowLayout());
		
		panel.setSize(150, 150);
		panel.setBackground(Color.RED);
		panel.add(btn);
		panel.add(btn2);
		panel.add(lb);
		
		add(panel);
		setResizable(false);
		setSize(300,200);
        setTitle("�׹�° ����");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
	}

}
