package test04;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import test03.Listen;
import test03.Speak;

public class Chatting {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9999);
			System.out.println("server wait");
			Socket socket = serverSocket.accept();
			System.out.println("연결완료");

			new Speak(socket).start();
			new Listen(socket).start();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
