package lab;



import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	private JPanel pan1 = new JPanel();
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	private JLabel jl = new JLabel("�ڹ� ���ڿ� �� ���� ȯ�� �մϴ�.�޴���� �޴� ��� ");
	private JButton jb1 = new JButton("�޺�����");
	private JButton jb2 = new JButton("������������");
	private JButton jb3 = new JButton("�Ұ������");

	public MyFrame() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Myframe");
		setVisible(true);
		add(pan1);
		pan1.add(pan2);
		pan1.add(pan3);
		pan2.add(jl);
		pan3.add(jb1);
		pan3.add(jb2);
		pan3.add(jb3);
		pan1.setBackground(Color.BLUE);
		jb1.setBackground(Color.gray);
		jb2.setBackground(Color.red);
		jb3.setBackground(Color.ORANGE);
		pan1.setBackground(Color.MAGENTA);
		pan2.setBackground(Color.cyan);
		pan3.setBackground(Color.lightGray);

	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}