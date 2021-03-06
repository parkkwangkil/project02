package test06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClientTest {
	public static void main(String[] args) {
		DatagramSocket sendSocket = null;
		DatagramSocket receiveSocket = null;

		try {
			// 보내는 쪽에서는 특별히 포트번호를 지정할 필요는 없음.
			sendSocket = new DatagramSocket();
			receiveSocket = new DatagramSocket(2222);

			Scanner scan = new Scanner(System.in);
			System.out.print("받아라 클라이언트");
			String sendMsg = scan.nextLine();

			
			byte[] sendData = sendMsg.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
					InetAddress.getByName("70.12.109.113"), 1111);

			sendSocket.send(sendPacket);
			System.out.println("전송 완료!");
			///////////////////////////////////////////////////////
			// 클라이언트가 먼저 메세지를 보내고 난 후에는
			// 답장을 기다려주게 하기.
			byte[] receiveData = new byte[256];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

			System.out.println("답장 기다리는중...");
			receiveSocket.receive(receivePacket);

			System.out.println("서버의 답장:" + new String(receiveData));
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sendSocket != null) {
				sendSocket.close();
			}
		}
	}
}