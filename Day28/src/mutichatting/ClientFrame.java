package mutichatting;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.omg.CORBA.portable.UnknownException;

public class ClientFrame extends JFrame {
	private JTextArea chatArea;
	private JPanel panelinput;
	private JTextField chatField;
	private JButton btnSend;
	private JPanel panelArea;

	private BufferedReader br;
	private BufferedWriter bw;

	public ClientFrame() {
		// GUI �ʱ�ȭ �κ�
		panelArea = new JPanel();
		panelinput = new JPanel();
		chatArea = new JTextArea();
		chatArea.setEditable(false);
		chatField = new JTextField();
		btnSend = new JButton("����");

		// �̺�Ʈ ó����(�������� �޼��� ������ �۾�) ���
		ChattingListener listener = new ChattingListener();
		chatField.addActionListener(listener);
		btnSend.addActionListener(listener);

		panelArea.setLayout(new BorderLayout());
		panelArea.add(new JScrollPane(chatArea));

		panelinput.setLayout(new BorderLayout());
		panelinput.add(chatField);
		panelinput.add(btnSend, BorderLayout.EAST);

		add(panelArea, BorderLayout.CENTER);
		add(panelinput, BorderLayout.SOUTH);

		setTitle("����ä�� Ŭ���̾�Ʈ ������");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		/////////////////////////////////////////////////////
		// �������� ����� ���� ��Ʈ��ũ ���� �κ�
		try {
			Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 1234);

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ������ ������ �Ŀ� �г��� �Է��ؼ� �����ϱ�
			String nickname = JOptionPane.showInputDialog(this, "��ȭ�� �Է��ϼ���.", JOptionPane.INFORMATION_MESSAGE);

			bw.write(nickname + "\n");
			bw.flush();

			// �г��� ���� �Ŀ��� ������ ������ �޼��� �޴� ������
			new ListenThread().start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// �̺�Ʈ ó�� Ŭ����(ä�ó��� �������� ������)
	class ChattingListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String msg = chatField.getText();
			chatField.setText("");

			try {
				bw.write(msg + "\n");
				bw.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	// �����κ��� �޼����� �޴� ���� ������ Ŭ����
	class ListenThread extends Thread {
		@Override
		public void run() {
			try {
				while (true) {
					String receiveMsg = br.readLine();
					chatArea.append(receiveMsg + "\n");
					chatArea.setCaretPosition(chatArea.getText().length());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ClientFrame();
	}
}