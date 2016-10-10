package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServrTest {
	public static void main(String[] args) {
		try {
			// TCP 통신에서는 서버가 특정 포트를 점유하고 먼저 실행 되서 대기중
			ServerSocket serverSocket = new ServerSocket(5555);

			System.out.println("NOW LOADING");
			Socket socket = serverSocket.accept(); // 서버가 기다림
			System.out.println("client COME ON YO~" + socket.getInetAddress());

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 클라이언트가 보내는 문장 한줄을 수신대기
			while (true) {
				String receiveMsg = br.readLine();
				System.out.println("받음" + receiveMsg);
			}
		} catch (IOException e) {
			System.out.println("연결 종료");
			e.printStackTrace();
		}
	}

}
