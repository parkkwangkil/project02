package test01;

public class BankAccount {
	// �ʵ� ���� �κ�
	// ��ü ������ �ܾ� ������ �����ϰ� ���� �ϴ� ��� ����
	public int balance;

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
