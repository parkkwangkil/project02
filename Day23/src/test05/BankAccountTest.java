package test05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		HashMap<String, BankAccount> ba = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String name; // 이름
		String password; // 비번
		String acNum = null; // 계좌번호
		int inMoney; // 입금액
		int outMoney;// 출금액
		int balance;// 잔액
		int intMoney = 0; // 초기 금액
		int select; //
		boolean isExistAccount = false;

		while (true) {
			System.out.println("-- 1:가입 2:입금 3:출금 4:계좌조회  5:종료  -- ");
			System.out.print("select");
			select = sc.nextInt();

			if (select == 5)
				break;

			switch (select) {
			case 1: // 가입
				System.out.print("이름:");
				name = sc.next();
				System.out.print("비밀번호:");
				password = sc.next();
				System.out.print("초기금액:");
				intMoney = sc.nextInt();

				BankAccount account = new BankAccount(name, password, intMoney);
				ba.put("1111", new BankAccount(name, password, intMoney));
				account.printAccount();

				System.out.println(ba);
				break;
			case 2:
				System.out.println("입금 계좌");
				inMoney = sc.nextInt();
				System.out.println(ba);
				for (Map.Entry<String, BankAccount> count : ba.entrySet()) {
					String key = count.getKey();
					BankAccount value = count.getValue();
					System.out.println("계좌 : " + acNum);
					System.out.println("입금액 :" + inMoney);
					if (acNum.equals(ba.get(count).getAccountNumber())) {
						System.out.println("얼마 입금");
						inMoney = sc.nextInt();
						ba.get(count).deposit(intMoney);
						System.out.println("입금완료");
						isExistAccount = true;
						break;
					}
				}
				if(isExistAccount == false){
					System.out.println("유효하지 안아");
				}
			
			case 3:
				System.out.println("출금");
				acNum = sc.next();
				System.out.println("출금액");
				outMoney = sc.nextInt();
				System.out.println("비밀번호");
				password = sc.next();
				for (Map.Entry<String, BankAccount> count : ba.entrySet()) {
					String key = count.getKey();
					BankAccount value = count.getValue();
					
					System.out.println("출금액 :" + outMoney);
					System.out.println("비밀번호 :" + password);
					if (ba.get(acNum).passwordCheck(password)) {
						ba.get(acNum).withdraw(outMoney);
					} else {
						System.out.println("비번 오류");
					}
					break;
				}	
			case 4: 
				System.out.println("조회");
				acNum = sc.next();
				for (Map.Entry<String, BankAccount> count : ba.entrySet()) {
					String key = count.getKey();
					BankAccount value = count.getValue();
					System.out.println("계좌 : " + acNum);
					if(ba.equals(ba.get(acNum).getAccountNumber())){
						ba.get(acNum).printAccount();
						break;
					}

				}
				if(isExistAccount == false){
					System.out.println("유효하지 않아");
				}
				isExistAccount = false;
				break;
				default :
					System.out.println("입력 오류");

			}

		}
		System.out.println("존요");
	}

}
