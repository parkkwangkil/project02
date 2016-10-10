package work01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private Mypanel p = new Mypanel();
	
	public MyFrame(){
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		add(p);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
