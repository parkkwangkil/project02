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
			// 1111�� ��Ʈ ����
			receiveSocket = new DatagramSocket(1111);
			sendSocket = new DatagramSocket();

			byte[] receiveData = new byte[256];

			// ����ִ� ��Ŷ�� ���� �����Ͱ� �����ϸ� ��⵵�� ��.
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

			System.out.println("��ٸ��� ��...");
			// �� ��Ŷ�� ������ ���Ͽ��� ��ٸ�.
			receiveSocket.receive(receivePacket);

			System.out.println("�޾Ҵ�!!");
			System.out.println("Ŭ���̾�Ʈ:" + new String(receiveData));
			//////////////////////////////////////////////////////////
			// ���� ����� ������ �޼����� ���� �� ������ ������
			Scanner scan = new Scanner(System.in);
			System.out.print("call me");
			String sendMsg = scan.nextLine();

			byte[] sendData = sendMsg.getBytes();
			// ������ �̹� ��Ŷ�� ���� ���� �ִµ� �ű⿡ Ŭ���̾�Ʈ��
			// �������ּҰ� ��������. �״�� �����ϱ�.
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), 2222);
			sendSocket.send(sendPacket);
			System.out.println("�亯 �Ϸ�!");
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