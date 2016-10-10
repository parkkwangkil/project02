package programming01;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
	//Box box;
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JTextField text = new JTextField(1);
	JTextField text2 = new JTextField("1마일은 1.6 킬로미터 입니다.");
	JButton button = new JButton("변환");
	JLabel label = new JLabel("거리를 마일 단위로 입력하세요");

	public MyFrame() {

		MyListner listner = new MyListner();
		/////////////////////////////////////////
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("마일을 킬로미터로 변환");
		setVisible(true);
		/////////////////////////////////////////
		add(pan1);
		pan1.add(label);
		pan1.add(text);
		pan1.add(button);
		pan1.add(text2);
		button.addActionListener(listner);
		
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();

	}

	/////////////////////////////////////////
	public class MyListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				String str = text.getText();
				int mile = Integer.parseInt(str);
				double kilo = mile * 1.609344;
				text2.setText(String.format(mile + "마일은" + kilo + "킬로미터입니다."));
			    //System.out.println(mile+kilo);

			}
		}

	}
}
