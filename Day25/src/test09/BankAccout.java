package test09;

public class BankAccout {
	private int balance;

	synchronized public void deposit(int money) {
		balance += money; // balance = balance +money;
	}

	// ��ũ�γ������ �ٸ� �۾��� ����� �۾��� ���� �� .
	synchronized public void withdraw(int money) {
		balance -= money;
		if (balance < 0)
			System.out.println("�ܾ� ����");
	}

}
