package test01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount b = new BankAccount();

		int money;
		b.balance = 10000;
		while (true) { // ���� �ݺ� �� ��
			System.out.println("1.�Ա� 2.��� 3.��ȸ 4.����");
			System.out.println("�۾� ���� ");
			int select = sc.nextInt();

			if (select == 4)
				break;

			switch (select) {
			case 1:
				System.out.println("�Աݾ�");
				money = sc.nextInt();
				b.deposit(money);
				break; // switch ���� Ż�� �ϴ� switch
			case 2:
				System.out.println("��ݾ�");
				money = sc.nextInt();
				b.withdraw(money);
				break;
			case 3:
				System.out.println("��ȸ =" + b.getBalance());
				money = sc.nextInt();
				break;
			default:
				System.out.println("�߸� �� �Է�");

			}
		}
		System.out.println("��");
		// b.withdraw(16000); // 60��ŭ�� ��� �ϰڴ�.
		// System.out.println("���� �ܷ� ="+b.getBalance()); // �ƹ��� ���� �־��� �ʿ� ����.
		//
		// b.addInterest(); // ���� �߰� �ϴ� ���
		// System.out.println("���� �ܾ� =" +b.getBalance());
	}

}
