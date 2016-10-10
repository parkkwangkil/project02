package work01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket;

			serverSocket = new ServerSocket(5555);
			System.out.println("hey server");
			Socket socket = serverSocket.accept();
			System.out.println("come on yo client" + socket.getInetAddress());

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			Scanner sc = new Scanner(System.in);

			while (true) {
				String receiveMsg = br.readLine();
				System.out.println("get u" + receiveMsg);

				String sendMsg = br.readLine();
				System.out.println("hey client");

				bw.write(sendMsg + "\n");
				bw.flush();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
