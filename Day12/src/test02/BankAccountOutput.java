package test02;

import java.util.Scanner;

public class BankAccountOutput {

	public static void main(String[] args) {
		BankAccount[] customer_list = new BankAccount[100];
		Scanner input = new Scanner(System.in);
		String name, password, acNum;
		int initMoney, balance;
		int i; // 고객 목록에서 계좌번호 찾을때 쓰는변수

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
				
				int custCount = BankAccount.getCustomerCount();
				customer_list[custCount] = new BankAccount(name, password, initMoney);
				System.out.println("회원가입 완료");
				customer_list[custCount].printAccount();
				break;
				
			case 2: // 입금
				System.out.print("입금할 계좌번호 입력:");
				acNum = input.next();
				System.out.print("얼마입금?:");
				balance = input.nextInt();
				custCount = BankAccount.getCustomerCount();
				// 현재 입력한 계좌번호와 일치하는 계좌를
				// 고객 목록에서 찾기
				for (i = 0; i < custCount; i++) {
					if (acNum.equals(customer_list[i].getAccountNumber())) {
						customer_list[i].deposit(balance);
						System.out.println("입금완료");
						break; // 계좌 찾았으므로 반복종료
					}
				}
				if (i == custCount) {
					System.out.println("해당 계좌 없음");
				}
				break;
			case 3: // 출금
				System.out.print("출금할 계좌번호 입력:");
				acNum = input.next();
				System.out.print("얼마출금?:");
				balance = input.nextInt();
				System.out.print("비밀번호:");
				password = input.next();

				custCount = BankAccount.getCustomerCount();
				// 현재 입력한 계좌번호와 일치하는 계좌를
				// 고객 목록에서 찾기
				for (i = 0; i < custCount; i++) {
					// 아래 if가 참이면 입력한 번호와 일치계좌 찾음
					if (acNum.equals(customer_list[i].getAccountNumber())) {
						// 아래 if가 참이면 해당 계좌와 입력비밀번호 일치
						if (customer_list[i].passwordCheck(password)) {
							customer_list[i].withdraw(balance);
						} else {
							System.out.println("비밀번호 오류");
						}
						break; // 계좌 찾았으므로 반복종료
					}
				}
				if (i == custCount) {
					System.out.println("해당 계좌 없음");
				}
				break;
			case 4: // 계좌 조회
				System.out.print("조회할 계좌번호 입력:");
				acNum = input.next();
				custCount = BankAccount.getCustomerCount();
				// 현재 입력한 계좌번호와 일치하는 계좌를
				// 고객 목록에서 찾기
				for (i = 0; i < custCount; i++) {
					if (acNum.equals(customer_list[i].getAccountNumber())) {
						customer_list[i].printAccount();
						break; // 계좌 찾았으므로 반복종료
					}
				}
				if (i == custCount) {
					System.out.println("해당 계좌 없음");
				}
				break;
			default:
				System.out.println("입력이 잘못되었습니다.");
			}
		}

		System.out.println(" -- 프로그램이 종료되었습니다. byebye -- ");

	}

}