package test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServrTest {
	public static void main(String[] args) {
		try {
			// TCP ��ſ����� ������ Ư�� ��Ʈ�� �����ϰ� ���� ���� �Ǽ� �����
			ServerSocket serverSocket = new ServerSocket(5555);

			System.out.println("NOW LOADING");
			Socket socket = serverSocket.accept(); // ������ ��ٸ�
			System.out.println("client COME ON YO~" + socket.getInetAddress());

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// Ŭ���̾�Ʈ�� ������ ���� ������ ���Ŵ��
			Scanner sc = new Scanner(System.in);
			while (true) {
				// ���D
				String receiveMsg = br.readLine();
				System.out.println("����" + receiveMsg);

				// ���ϱ�
				System.out.println("hey client don't do that");
				String sendMsg = sc.nextLine();

				bw.write(sendMsg + "\n");
				bw.flush();

			}
		} catch (IOException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}
	}

}
