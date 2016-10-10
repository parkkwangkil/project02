package misson22;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyFrame extends JFrame {
	private JButton btnCount = new JButton("COUNT");
	private JButton btnReset = new JButton("RESET");
	private JPanel panelCount = new JPanel();
	private JPanel panelBtn = new JPanel();
	private JLabel lbCount = new JLabel("0");

	 private int countNum = 0;
     
	    public MyFrame(){
	        lbCount.setFont(new Font("±¼¸²", Font.BOLD, 100));
	         
	        panelCount.add(lbCount);
	        
	        CountListener listener = new CountListener();
	         
	        btnCount.addActionListener(listener);
	        btnReset.addActionListener(listener);
	        
	         
	        panelBtn.setLayout(new GridLayout(1, 2));
	        panelBtn.add(btnCount);
	        panelBtn.add(btnReset);
	         
	        add(panelCount, BorderLayout.CENTER);
	        add(panelBtn, BorderLayout.PAGE_END);
	         
	        setSize(300,200);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setVisible(true);
	    }
	     
	    public static void main(String[] args) {
	        MyFrame f = new MyFrame();
	    }

	    class CountListener implements ActionListener{
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            if(e.getSource() == btnCount){
	                countNum++;
	                lbCount.setText(countNum+"");
	            }else if(e.getSource() == btnReset){
	                countNum = 0;
	            }
	                lbCount.setText(countNum+"");
	            }
	        }
	    }
	