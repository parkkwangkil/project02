package rps;

import java.util.Random;
import java.util.Scanner;

public class Rps {

	private int user;
	private int pc;

	public Rps() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("�Է�");
		user = sc.nextInt();
		System.out.println("�Ԏ�2");
		pc = sc.nextInt();

		if (user == 0) {
			System.out.println("����");
		} else if (user == 1) {
			System.out.println("����");
		} else if (user == 2) {
			System.out.println("��");
		}
	}

	public void checkrps(int y) {

		if (pc == 0) {
			System.out.println("�̱�");
		} else if (pc == 1) {
			System.out.println("���");

		} else if (pc == 2) {
			System.out.println("��");
		} else {
			System.out.println("��");

		}

	}

}
