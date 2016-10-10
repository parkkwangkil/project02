package game;

import java.util.Scanner;

public class DieTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Die die = new Die();
		int user;

		System.out.println("주사위 던져");
		user = sc.nextInt();
		die.roll();

		while (user == die.getValue());
		if (user != die.getValue()) {
			System.out.println("주사뉘 값은:" + die.toString());
		} else if (user == die.getValue()) {
			System.out.println("주사"+die.toString());
		}else{
			System.out.println("틀렸어");
		}

	}
}
