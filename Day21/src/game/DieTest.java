package game;

import java.util.Scanner;

public class DieTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Die die = new Die();
		int user;

		System.out.println("�ֻ��� ����");
		user = sc.nextInt();
		die.roll();

		while (user == die.getValue());
		if (user != die.getValue()) {
			System.out.println("�ֻ紵 ����:" + die.toString());
		} else if (user == die.getValue()) {
			System.out.println("�ֻ�"+die.toString());
		}else{
			System.out.println("Ʋ�Ⱦ�");
		}

	}
}
