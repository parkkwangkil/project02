package work03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JPanel panel = new JPanel();
	
	public MyFrame(){
	//	setLayout(new FlowLayout());
		
		panel.setSize(70, 70);
		panel.setBackground(Color.green);
		
		MyMouseListner listner = new MyMouseListner();
		panel.addMouseListener(listner);
		panel.addMouseMotionListener(listner);
		
		add(panel);
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	
	class MyMouseListner implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {	
			  System.out.println("드래그:"+e.getX()+","+e.getY());
		}

		@Override
		public void mouseMoved(MouseEvent e) {
//			System.out.printf("움직인:"+e.getX(), e.getY());
		}

		@Override
		public void mouseClicked(MouseEvent e) {
	//		System.out.println("클립:"+e.getClickCount());
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("눌림:"+e.getX()+","+e.getY());
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("해제됨:"+e.getX()+","+e.getY());
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		//	System.out.println("들어옴 ");			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			//System.out.println("나감");			
		}
		
	}

}
