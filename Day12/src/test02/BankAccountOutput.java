package test02;

import java.util.Scanner;

public class BankAccountOutput {

	public static void main(String[] args) {
		BankAccount[] customer_list = new BankAccount[100];
		Scanner input = new Scanner(System.in);
		String name, password, acNum;
		int initMoney, balance;
		int i; // �� ��Ͽ��� ���¹�ȣ ã���� ���º���

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
				
				int custCount = BankAccount.getCustomerCount();
				customer_list[custCount] = new BankAccount(name, password, initMoney);
				System.out.println("ȸ������ �Ϸ�");
				customer_list[custCount].printAccount();
				break;
				
			case 2: // �Ա�
				System.out.print("�Ա��� ���¹�ȣ �Է�:");
				acNum = input.next();
				System.out.print("���Ա�?:");
				balance = input.nextInt();
				custCount = BankAccount.getCustomerCount();
				// ���� �Է��� ���¹�ȣ�� ��ġ�ϴ� ���¸�
				// �� ��Ͽ��� ã��
				for (i = 0; i < custCount; i++) {
					if (acNum.equals(customer_list[i].getAccountNumber())) {
						customer_list[i].deposit(balance);
						System.out.println("�ԱݿϷ�");
						break; // ���� ã�����Ƿ� �ݺ�����
					}
				}
				if (i == custCount) {
					System.out.println("�ش� ���� ����");
				}
				break;
			case 3: // ���
				System.out.print("����� ���¹�ȣ �Է�:");
				acNum = input.next();
				System.out.print("�����?:");
				balance = input.nextInt();
				System.out.print("��й�ȣ:");
				password = input.next();

				custCount = BankAccount.getCustomerCount();
				// ���� �Է��� ���¹�ȣ�� ��ġ�ϴ� ���¸�
				// �� ��Ͽ��� ã��
				for (i = 0; i < custCount; i++) {
					// �Ʒ� if�� ���̸� �Է��� ��ȣ�� ��ġ���� ã��
					if (acNum.equals(customer_list[i].getAccountNumber())) {
						// �Ʒ� if�� ���̸� �ش� ���¿� �Էº�й�ȣ ��ġ
						if (customer_list[i].passwordCheck(password)) {
							customer_list[i].withdraw(balance);
						} else {
							System.out.println("��й�ȣ ����");
						}
						break; // ���� ã�����Ƿ� �ݺ�����
					}
				}
				if (i == custCount) {
					System.out.println("�ش� ���� ����");
				}
				break;
			case 4: // ���� ��ȸ
				System.out.print("��ȸ�� ���¹�ȣ �Է�:");
				acNum = input.next();
				custCount = BankAccount.getCustomerCount();
				// ���� �Է��� ���¹�ȣ�� ��ġ�ϴ� ���¸�
				// �� ��Ͽ��� ã��
				for (i = 0; i < custCount; i++) {
					if (acNum.equals(customer_list[i].getAccountNumber())) {
						customer_list[i].printAccount();
						break; // ���� ã�����Ƿ� �ݺ�����
					}
				}
				if (i == custCount) {
					System.out.println("�ش� ���� ����");
				}
				break;
			default:
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			}
		}

		System.out.println(" -- ���α׷��� ����Ǿ����ϴ�. byebye -- ");

	}

}