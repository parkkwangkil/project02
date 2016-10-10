package test03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Speak extends Thread {
	private BufferedWriter bw;

	public Speak(Socket socket) {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("bw fail");
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("me :");
				String sendMsg = sc.nextLine();

				bw.write(sendMsg + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			System.err.println("NotFound 404 error");
			e.printStackTrace();
		}
	}
}
