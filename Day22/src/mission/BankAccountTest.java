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
			System.out.println("1:���� 2:�Ա� 3:��� 4:������ȸ 5:�۱� 6: ���� ");
			System.out.print(" select >");
			select = sc.nextInt();
			
			if (select == 6)
			break;

			switch (select) {
			case 1:
				System.out.println("�Ӹ�");
				name = sc.next();
				System.out.println("��й�ȣ");
				password = sc.next();
				System.out.println("�ʱ�ݾ�");
				initMoney = sc.nextInt();
				int custCount = BankAccount.getCustomerCount();
				BankAccount ba = new BankAccount(name, password, initMoney);
				System.out.println("ȸ������ �Ϸ�");
				ba.printAccount();
				strlist.add(name);
				strlist.add(password);
				initlist.add(initMoney);

			case 2:
				System.out.println("�Ա� ����");
				acNum = sc.next();
				System.out.println("�� �Ա�");
				inputMoney = sc.nextInt();
				custCount = BankAccount.getCustomerCount();
				ba = new BankAccount(name, password, initMoney);
				for (i = 0; i < custCount; i++) {
					if (acNum.equals(ba.getAccountNumber())) {
						ba.deposit(inputMoney);
						System.out.println("�ԱݿϷ�");
						break;
					}
				}
				if (input == custCount) {
					System.out.println("�ش� ���� ����.");
				}
				break;
			case 3:
				System.out.println("��� ����");
				acNum = sc.next();
				System.out.println("��ݾ�");
				inputMoney = sc.nextInt();
				System.out.println("��й�ȣ �Է�");
				password = sc.next();
				ba = new BankAccount(name, password, initMoney);
				custCount = BankAccount.getCustomerCount();

				for (i = 0; i < custCount; i++) {
					if (ba.passwordCheck(password)) {
						ba.withdraw(inputMoney);
					} else {
						System.out.println("����");
					}
					break;
				}

				if (i == custCount) {
					System.out.println("���� ����");
				}
				break;
			case 4:
				System.out.println("���� �Է�");
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
					System.out.println("�ش� ���� ����");

				}
				break;
			case 5:
				System.out.println("�۱�");
				acNum = sc.next();
				ba = new BankAccount(name, password, initMoney);
				custCount = BankAccount.getCustomerCount();
				for (i = 0; i < custCount; i++) {
					if (acNum.equals(ba.getAccountNumber())) {
						System.out.println("�۱�");
					} else {
						System.out.println("�۱� ����");
						ba.printAccount();
						break;
					}
				}
			default:
				System.out.println("�Է� ����");
			}
		}
		System.out.println("����");

	}

}
