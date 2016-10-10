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
			System.out.println("\n -- 1:���� 2:�Ա� 3:��� 4:������ȸ  -1:���� -- ");
			System.out.print(" -- select >");
			int select = input.nextInt();

			if (select == -1)
				break;

			switch (select) {
			case 1: // ����
				System.out.print("�̸�:");
				name = input.next();
				System.out.print("��й�ȣ:");
				password = input.next();
				System.out.print("�ʱ�ݾ�:");
				initMoney = input.nextInt();

				// ����ڿ��� �Է¹��� ������ ���� ��ü ����
				account = new BankAccount(name, password, initMoney);
				customers.put(account.getAccountNumber(), account);
				System.out.println("ȸ������ �Ϸ�");
				account.printAccount(); // ������ �������� ���
				break;
			case 2: // �Ա�
				System.out.print("�Ա��� ���¹�ȣ �Է�:");
				acNum = input.next();

				// ���� �Է��� ���¹�ȣ�� ��ġ�ϴ� ���¸�
				// �� ��Ͽ��� ã��
				account = customers.get(acNum);
				if (account != null) {
					System.out.print("���Ա�?:");
					inputMoney = input.nextInt();
					account.deposit(inputMoney);
					System.out.println("�ԱݿϷ�");
				} else {
					System.out.println("��ȿ���� ���� ���¹�ȣ �Դϴ�.");
				}
				break;
			case 3: // ���
				System.out.print("����� ���¹�ȣ �Է�:");
				acNum = input.next();
				System.out.print("�����?:");
				inputMoney = input.nextInt();
				System.out.print("��й�ȣ:");
				password = input.next();

				account = customers.get(acNum);
				// map���� get�� ����� null�� �ƴϸ� ��������
				// �ش� ���°�ü�� �ּҰ� account�� ���ԵǾ� ����.
				if (account != null) {
					if (account.passwordCheck(password)) {
						account.withdraw(inputMoney);
					} else {
						System.out.println("��й�ȣ ����");
					}
				} else {
					System.out.println("��ȿ���� ���� ���¹�ȣ �Դϴ�.");
				}
				break;
			case 4: // ���� ��ȸ
				System.out.print("��ȸ�� ���¹�ȣ �Է�:");
				acNum = input.next();
				// ���� �Է��� ���¹�ȣ�� ��ġ�ϴ� ���¸�
				// �� ��Ͽ��� ã��
				account = customers.get(acNum);
				if (account != null) {
					account.printAccount();
				} else {
					System.out.println("��ȿ���� ���� ���¹�ȣ �Դϴ�.");
				}
				break;
			default:
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			}
		}

		System.out.println(" -- ���α׷��� ����Ǿ����ϴ�. byebye -- ");
	}
}