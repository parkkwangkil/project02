package test03;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	private int randomNumber; // 랜덤 한 숫자가 저장될 변수
	private int userGuess; // 사용자가 입력하는 숫자 저장할 변수

	private void rollDice() {
		// randomNumber = (int) (Math.random() * 10) + 1;
		randomNumber = new Random().nextInt(10) + 1;
	}

	private void inputUserGuess() {
		Scanner sc = new Scanner(System.in);
		System.out.println("추측 숫자");
		userGuess = sc.nextInt();
	}

	public void checkAnswer() {
		Scanner sc = new Scanner(System.in);
		if (randomNumber == userGuess) { // 둘다 int 라서 비교 가능
			System.out.println("맞음 ");
		} else {
			System.out.println("틀림 정답은" + randomNumber + "다");

		}
	}
	
	
	public void startGame(){
		rollDice();
		inputUserGuess();
		checkAnswer();
	}

}
