package test06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class UDPServerTest {

	public static void main(String[] args) {
		DatagramSocket receiveSocket = null;
		DatagramSocket sendSocket = null;
		try {
			// 1111번 포트 점유
			receiveSocket = new DatagramSocket(1111);
			sendSocket = new DatagramSocket();

			byte[] receiveData = new byte[256];

			// 비어있는 패킷을 만들어서 데이터가 도착하면 담기도록 함.
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

			System.out.println("기다리는 중...");
			// 빈 패킷을 가지고 소켓에서 기다림.
			receiveSocket.receive(receivePacket);

			System.out.println("받았다!!");
			System.out.println("클라이언트:" + new String(receiveData));
			//////////////////////////////////////////////////////////
			// 먼저 실행된 서버가 메세지를 받은 후 답장을 보내기
			Scanner scan = new Scanner(System.in);
			System.out.print("call me");
			String sendMsg = scan.nextLine();

			byte[] sendData = sendMsg.getBytes();
			// 서버는 이미 패킷을 받은 적이 있는데 거기에 클라이언트의
			// 아이피주소가 적혀있음. 그대로 답장하기.
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), 2222);
			sendSocket.send(sendPacket);
			System.out.println("답변 완료!");
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (receiveSocket != null) {
				receiveSocket.close();
			}
		}
	}
}