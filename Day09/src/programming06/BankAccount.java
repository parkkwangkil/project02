package programming06;

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
	public int transfer(int amount, BankAccount otherAccount){
		otherAccount.desosit(amount);
		balance -= amount;
		return balance;
	}

	
	}




