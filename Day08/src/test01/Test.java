package test01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount b = new BankAccount();

		int money;
		b.balance = 10000;
		while (true) { // 무한 반복 후 끝
			System.out.println("1.입금 2.출금 3.조회 4.종료");
			System.out.println("작업 선택 ");
			int select = sc.nextInt();

			if (select == 4)
				break;

			switch (select) {
			case 1:
				System.out.println("입금액");
				money = sc.nextInt();
				b.deposit(money);
				break; // switch 문을 탈출 하는 switch
			case 2:
				System.out.println("출금액");
				money = sc.nextInt();
				b.withdraw(money);
				break;
			case 3:
				System.out.println("조회 =" + b.getBalance());
				money = sc.nextInt();
				break;
			default:
				System.out.println("잘못 된 입력");

			}
		}
		System.out.println("끝");
		// b.withdraw(16000); // 60만큼을 출력 하겠다.
		// System.out.println("현재 잔래 ="+b.getBalance()); // 아무런 갑슬 넣어줄 필요 없다.
		//
		// b.addInterest(); // 이자 추가 하는 명령
		// System.out.println("현재 잔액 =" +b.getBalance());
	}

}
