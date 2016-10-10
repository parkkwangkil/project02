package test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		try {
			Socket sockt = new Socket(InetAddress.getByName("70.12.109.123"), 5555);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sockt.getOutputStream()));

			Scanner sc = new Scanner(System.in);
			// System.out.println("hey Server");
			// String sendMsg = sc.nextLine();

			while (true) {
				System.out.println("hey Server");
				String sendMsg = sc.nextLine();

				bw.write(sendMsg + "\n");
				bw.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}