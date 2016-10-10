package test08;

public class BankAccout {
	private int balance;

	 public void deposit(int money) {
		balance += money; // balance = balance +money;
	}

	// 싱크로나이즈드 다른 작업이 수행시 작업을 막는 것 .
	 public void withdraw(int money) {
		balance -= money;
		if (balance < 0)
			System.out.println("잔액 음수");
	}

}
