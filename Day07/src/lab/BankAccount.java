package lab;

 class BankAccount { // 계좌
	int balance; // 잔액 변수

	void deposit(int amount) { // 저금
		balance += amount;
	}

	void withdraw(int amount) { // 인출
		if (balance - amount < 0)
			balance -= amount;
		return;

	}

	int getBalance() { // 반환
		System.out.println("잔고: " + balance);
		return balance;

	}

	public void addInterest(int i) { // 2번 문제
		balance = (int) (balance + balance * 0.075); // 연 7.5의 이자 계싼
	}
}

  class Lab2 {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(100);// 저금
		b.withdraw(60); // 인출
		b.addInterest(0); // 이자
		b.getBalance();
	}
}

// 3번 public을 붙여 줄 경우 class가 두개가 생성 되어 class의 이름을 하나에 맞퉈주거나 해야 함 
