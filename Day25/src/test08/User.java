package test08;

public class User extends Thread {
	private BankAccout account;

	public User(BankAccout account) {
		// 계좌 객체 주솔를 받아 멤버에 저장
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			account.deposit(1000);
			account.withdraw(1000);
		}
	}

}
