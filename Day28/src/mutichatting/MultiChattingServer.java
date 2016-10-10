package mutichatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MultiChattingServer {
	private ServerSocket serverSocket;
	private List<ChattingThread> threadList;

	// ������ Ŭ���̾�Ʈ�� �� ��ŭ �����带 ����Ʈ�� �����ϰ�
	// Ŭ���̾�Ʈ�� �߰� �� �� ���� ������ �����Ͽ� �����忡�� ����
	public MultiChattingServer() {
		threadList = new ArrayList<>();
		try {
			serverSocket = new ServerSocket(1234);
			System.out.println("wait client");
			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("incoming" + socket.getInetAddress());
				// threadList.add(new ChattingThread(socket));
				// ���ο� Ŭ���̾�Ʈ �����ϸ� ���ο�
				// ������ ��ü�� �����ؼ� ����Ʈ�� �߰���.
				ChattingThread t = new ChattingThread(socket);
				threadList.add(t);
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ������ ����Ʈ�� �ִ� ��� �����忡�� �޼��� �߼� ����ؼ�
	// ��� Ŭ���̾�Ʈ���� �޼��� ����ϱ� �޼ҵ�
	public void broadCast(String msg) {
		for (ChattingThread t : threadList) {
			t.speak(msg);
		}
	}

	// ������ ����� Ư�� ������ ����
	public void removeThread(ChattingThread t) {
		threadList.remove(t);
	}

	// �ϳ��� Ŭ���̾�Ʈ�� ���� ���� ��
	class ChattingThread extends Thread {
		private String nickname;
		private BufferedReader br;
		private BufferedWriter bw;

		public ChattingThread(Socket socket) {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				nickname = br.readLine();
				broadCast("[" + nickname + "]���� �����߽��ϴ�.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void run() {
			try {
				while (true) {
					String msg = br.readLine();
					broadCast(nickname + ":" + msg);
				}
			} catch (IOException e) {
				// ��� Ŭ���̾�Ʈ�� ���� ���� ��
				removeThread(this);
				broadCast("[" + nickname + "]���� ���� ����");
				e.printStackTrace();
			}
		}

		// ���� �����尡 ����ϴ� Ŭ���̾�Ʈ���� �޽����� ������.
		public void speak(String msg) {
			try {
				bw.write(msg + "\n");
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		MultiChattingServer m = new MultiChattingServer();
	}
}
