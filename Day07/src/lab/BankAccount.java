package lab;

 class BankAccount { // ����
	int balance; // �ܾ� ����

	void deposit(int amount) { // ����
		balance += amount;
	}

	void withdraw(int amount) { // ����
		if (balance - amount < 0)
			balance -= amount;
		return;

	}

	int getBalance() { // ��ȯ
		System.out.println("�ܰ�: " + balance);
		return balance;

	}

	public void addInterest(int i) { // 2�� ����
		balance = (int) (balance + balance * 0.075); // �� 7.5�� ���� ���
	}
}

  class Lab2 {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(100);// ����
		b.withdraw(60); // ����
		b.addInterest(0); // ����
		b.getBalance();
	}
}

// 3�� public�� �ٿ� �� ��� class�� �ΰ��� ���� �Ǿ� class�� �̸��� �ϳ��� �����ְų� �ؾ� �� 
