package test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		Map<String, BankAccount> customers = new HashMap<>();
		Scanner input = new Scanner(System.in);
		String name, password, acNum;
		int initMoney, inputMoney;
		BankAccount account;

		while (true) {
			System.out.println("\n -- 1:가입 2:입금 3:출금 4:계좌조회  -1:종료 -- ");
			System.out.print(" -- select >");
			int select = input.nextInt();

			if (select == -1)
				break;

			switch (select) {
			case 1: // 가입
				System.out.print("이름:");
				name = input.next();
				System.out.print("비밀번호:");
				password = input.next();
				System.out.print("초기금액:");
				initMoney = input.nextInt();

				// 사용자에게 입력받은 정보고 계좌 객체 생성
				account = new BankAccount(name, password, initMoney);
				customers.put(account.getAccountNumber(), account);
				System.out.println("회원가입 완료");
				account.printAccount(); // 생성된 계좌정보 출력
				break;
			case 2: // 입금
				System.out.print("입금할 계좌번호 입력:");
				acNum = input.next();

				// 현재 입력한 계좌번호와 일치하는 계좌를
				// 고객 목록에서 찾기
				account = customers.get(acNum);
				if (account != null) {
					System.out.print("얼마입금?:");
					inputMoney = input.nextInt();
					account.deposit(inputMoney);
					System.out.println("입금완료");
				} else {
					System.out.println("유효하지 않은 계좌번호 입니다.");
				}
				break;
			case 3: // 출금
				System.out.print("출금할 계좌번호 입력:");
				acNum = input.next();
				System.out.print("얼마출금?:");
				inputMoney = input.nextInt();
				System.out.print("비밀번호:");
				password = input.next();

				account = customers.get(acNum);
				// map에서 get한 결과가 null이 아니면 계좌있음
				// 해당 계좌객체의 주소가 account에 대입되어 있음.
				if (account != null) {
					if (account.passwordCheck(password)) {
						account.withdraw(inputMoney);
					} else {
						System.out.println("비밀번호 오류");
					}
				} else {
					System.out.println("유효하지 않은 계좌번호 입니다.");
				}
				break;
			case 4: // 계좌 조회
				System.out.print("조회할 계좌번호 입력:");
				acNum = input.next();
				// 현재 입력한 계좌번호와 일치하는 계좌를
				// 고객 목록에서 찾기
				account = customers.get(acNum);
				if (account != null) {
					account.printAccount();
				} else {
					System.out.println("유효하지 않은 계좌번호 입니다.");
				}
				break;
			default:
				System.out.println("입력이 잘못되었습니다.");
			}
		}

		System.out.println(" -- 프로그램이 종료되었습니다. byebye -- ");
	}
}