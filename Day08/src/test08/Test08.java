package test08;

public class Test08 {

	public class BankAccount {
		// �ʵ� ���� �κ�
		// ��ü ������ �ܾ� ������ �����ϰ� ���� �ϴ� ��� ����
		int balance;

		// �޼��� ����κ�
		// �Ա��ϱ�
		void deposit(int money) { // �Ա�

			balance += money;
		}

		void withdraw(int money) {// ���
			// balance -= money;
			if (balance >= money) {
				balance -= money;
			} else {
				System.out.println("��� ����");
			}
		}

		int getBalance() { // �ܾ� ������ ��ü ������ �������� (���� ������ �ִ� ������ ��������)
			return balance;

		}

		public void addInterest() {
			 balance += (int)(balance*0.075);
		}
	}
}