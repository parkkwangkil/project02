package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServrTest {
	public static void main(String[] args) {
		try {
			// TCP ��ſ����� ������ Ư�� ��Ʈ�� �����ϰ� ���� ���� �Ǽ� �����
			ServerSocket serverSocket = new ServerSocket(5555);

			System.out.println("NOW LOADING");
			Socket socket = serverSocket.accept(); // ������ ��ٸ�
			System.out.println("client COME ON YO~" + socket.getInetAddress());

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// Ŭ���̾�Ʈ�� ������ ���� ������ ���Ŵ��
			while (true) {
				String receiveMsg = br.readLine();
				System.out.println("����" + receiveMsg);
			}
		} catch (IOException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}
	}

}
