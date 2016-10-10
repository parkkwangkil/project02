package test03;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	private int randomNumber; // ���� �� ���ڰ� ����� ����
	private int userGuess; // ����ڰ� �Է��ϴ� ���� ������ ����

	private void rollDice() {
		// randomNumber = (int) (Math.random() * 10) + 1;
		randomNumber = new Random().nextInt(10) + 1;
	}

	private void inputUserGuess() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ����");
		userGuess = sc.nextInt();
	}

	public void checkAnswer() {
		Scanner sc = new Scanner(System.in);
		if (randomNumber == userGuess) { // �Ѵ� int �� �� ����
			System.out.println("���� ");
		} else {
			System.out.println("Ʋ�� ������" + randomNumber + "��");

		}
	}
	
	
	public void startGame(){
		rollDice();
		inputUserGuess();
		checkAnswer();
	}

}
