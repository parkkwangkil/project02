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

	// 서버는 클라이언트의 수 만큼 스레드를 리스트에 유지하고
	// 클라이언트가 추가 될 떄 마다 소켓을 생성하여 스레드에게 전달
	public MultiChattingServer() {
		threadList = new ArrayList<>();
		try {
			serverSocket = new ServerSocket(1234);
			System.out.println("wait client");
			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("incoming" + socket.getInetAddress());
				// threadList.add(new ChattingThread(socket));
				// 새로운 클라이언트 접속하면 새로운
				// 쓰레드 객체를 생성해서 리스트에 추가함.
				ChattingThread t = new ChattingThread(socket);
				threadList.add(t);
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 서버의 리스트에 있는 모든 쓰레드에게 메세지 발송 명령해서
	// 모든 클라이언트에게 메세지 방송하기 메소드
	public void broadCast(String msg) {
		for (ChattingThread t : threadList) {
			t.speak(msg);
		}
	}

	// 스레드 목록중 특정 스레드 삭제
	public void removeThread(ChattingThread t) {
		threadList.remove(t);
	}

	// 하나의 클라이언트가 접속 했을 때
	class ChattingThread extends Thread {
		private String nickname;
		private BufferedReader br;
		private BufferedWriter bw;

		public ChattingThread(Socket socket) {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				nickname = br.readLine();
				broadCast("[" + nickname + "]님이 입장했습니다.");
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
				// 당당 클라이언트가 퇴장 했을 때
				removeThread(this);
				broadCast("[" + nickname + "]님이 퇴장 했음");
				e.printStackTrace();
			}
		}

		// 현재 스레드가 담당하는 클라이언트에게 메시지를 보낸다.
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
