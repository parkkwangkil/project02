package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Listen extends Thread {
	private BufferedReader br;

	public Listen(Socket socket) {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			System.out.println("be error");
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {

				String receiveMsg = br.readLine();
				System.out.println("����  :" + receiveMsg);
			}
		} catch (IOException e) {
			System.out.println("listen ����");
			e.printStackTrace();
		}
	}
}
