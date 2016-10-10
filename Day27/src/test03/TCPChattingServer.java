package test03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPChattingServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9999);
			System.out.println("server wait");
			Socket socket = serverSocket.accept();
			System.out.println("connect");

			new Speak(socket).start();
			new Listen(socket).start();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println();

	}

}
