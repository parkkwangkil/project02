package test08;

public class BankAccout {
	private int balance;

	 public void deposit(int money) {
		balance += money; // balance = balance +money;
	}

	// ��ũ�γ������ �ٸ� �۾��� ����� �۾��� ���� �� .
	 public void withdraw(int money) {
		balance -= money;
		if (balance < 0)
			System.out.println("�ܾ� ����");
	}

}
