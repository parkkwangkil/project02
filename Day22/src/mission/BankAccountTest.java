package mission;

import java.util.LinkedList;
import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		LinkedList<String> strlist = new LinkedList<>();
		LinkedList<Integer> initlist = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		String name = null, password = null, acNum;
		int initMoney = 0, inputMoney, input = 0, select, i;

		while (true) {
			System.out.println("1:가입 2:입금 3:출금 4:계좌조회 5:송금 6: 종료 ");
			System.out.print(" select >");
			select = sc.nextInt();
			
			if (select == 6)
			break;

			switch (select) {
			case 1:
				System.out.println("임름");
				name = sc.next();
				System.out.println("비밀번호");
				password = sc.next();
				System.out.println("초기금액");
				initMoney = sc.nextInt();
				int custCount = BankAccount.getCustomerCount();
				BankAccount ba = new BankAccount(name, password, initMoney);
				System.out.println("회원가입 완료");
				ba.printAccount();
				strlist.add(name);
				strlist.add(password);
				initlist.add(initMoney);

			case 2:
				System.out.println("입금 계좌");
				acNum = sc.next();
				System.out.println("얼마 입금");
				inputMoney = sc.nextInt();
				custCount = BankAccount.getCustomerCount();
				ba = new BankAccount(name, password, initMoney);
				for (i = 0; i < custCount; i++) {
					if (acNum.equals(ba.getAccountNumber())) {
						ba.deposit(inputMoney);
						System.out.println("입금완료");
						break;
					}
				}
				if (input == custCount) {
					System.out.println("해당 계좌 없다.");
				}
				break;
			case 3:
				System.out.println("출금 계좌");
				acNum = sc.next();
				System.out.println("출금액");
				inputMoney = sc.nextInt();
				System.out.println("비밀번호 입력");
				password = sc.next();
				ba = new BankAccount(name, password, initMoney);
				custCount = BankAccount.getCustomerCount();

				for (i = 0; i < custCount; i++) {
					if (ba.passwordCheck(password)) {
						ba.withdraw(inputMoney);
					} else {
						System.out.println("오류");
					}
					break;
				}

				if (i == custCount) {
					System.out.println("계좌 없다");
				}
				break;
			case 4:
				System.out.println("계좌 입력");
				acNum = sc.next();
				ba = new BankAccount(name, password, initMoney);
				custCount = BankAccount.getCustomerCount();
				for (i = 0; i < custCount; i++) {
					if (acNum.equals(ba.getAccountNumber())) {
						ba.printAccount();
						break;
					}
				}
				if (i == custCount) {
					System.out.println("해당 계좌 없다");

				}
				break;
			case 5:
				System.out.println("송금");
				acNum = sc.next();
				ba = new BankAccount(name, password, initMoney);
				custCount = BankAccount.getCustomerCount();
				for (i = 0; i < custCount; i++) {
					if (acNum.equals(ba.getAccountNumber())) {
						System.out.println("송금");
					} else {
						System.out.println("송금 실패");
						ba.printAccount();
						break;
					}
				}
			default:
				System.out.println("입력 실패");
			}
		}
		System.out.println("종료");

	}

}
