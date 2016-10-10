package test07;

public class BankAccount {
	int accountNumber;
	String owner;
	int balance;

	public void desosit(int amount) {
		balance += amount;
		
	}

	public void withdraw(int amount) {
		balance -= amount;
		
	}
	public String  toString() {
		return "현재 잔액은"+balance+"입니다";
		
	}

}
