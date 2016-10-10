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
		String name; // �̸�
		String password; // ���
		String acNum = null; // ���¹�ȣ
		int inMoney; // �Աݾ�
		int outMoney;// ��ݾ�
		int balance;// �ܾ�
		int intMoney = 0; // �ʱ� �ݾ�
		int select; //
		boolean isExistAccount = false;

		while (true) {
			System.out.println("-- 1:���� 2:�Ա� 3:��� 4:������ȸ  5:����  -- ");
			System.out.print("select");
			select = sc.nextInt();

			if (select == 5)
				break;

			switch (select) {
			case 1: // ����
				System.out.print("�̸�:");
				name = sc.next();
				System.out.print("��й�ȣ:");
				password = sc.next();
				System.out.print("�ʱ�ݾ�:");
				intMoney = sc.nextInt();

				BankAccount account = new BankAccount(name, password, intMoney);
				ba.put("1111", new BankAccount(name, password, intMoney));
				account.printAccount();

				System.out.println(ba);
				break;
			case 2:
				System.out.println("�Ա� ����");
				inMoney = sc.nextInt();
				System.out.println(ba);
				for (Map.Entry<String, BankAccount> count : ba.entrySet()) {
					String key = count.getKey();
					BankAccount value = count.getValue();
					System.out.println("���� : " + acNum);
					System.out.println("�Աݾ� :" + inMoney);
					if (acNum.equals(ba.get(count).getAccountNumber())) {
						System.out.println("�� �Ա�");
						inMoney = sc.nextInt();
						ba.get(count).deposit(intMoney);
						System.out.println("�ԱݿϷ�");
						isExistAccount = true;
						break;
					}
				}
				if(isExistAccount == false){
					System.out.println("��ȿ���� �Ⱦ�");
				}
			
			case 3:
				System.out.println("���");
				acNum = sc.next();
				System.out.println("��ݾ�");
				outMoney = sc.nextInt();
				System.out.println("��й�ȣ");
				password = sc.next();
				for (Map.Entry<String, BankAccount> count : ba.entrySet()) {
					String key = count.getKey();
					BankAccount value = count.getValue();
					
					System.out.println("��ݾ� :" + outMoney);
					System.out.println("��й�ȣ :" + password);
					if (ba.get(acNum).passwordCheck(password)) {
						ba.get(acNum).withdraw(outMoney);
					} else {
						System.out.println("��� ����");
					}
					break;
				}	
			case 4: 
				System.out.println("��ȸ");
				acNum = sc.next();
				for (Map.Entry<String, BankAccount> count : ba.entrySet()) {
					String key = count.getKey();
					BankAccount value = count.getValue();
					System.out.println("���� : " + acNum);
					if(ba.equals(ba.get(acNum).getAccountNumber())){
						ba.get(acNum).printAccount();
						break;
					}

				}
				if(isExistAccount == false){
					System.out.println("��ȿ���� �ʾ�");
				}
				isExistAccount = false;
				break;
				default :
					System.out.println("�Է� ����");

			}

		}
		System.out.println("����");
	}

}
