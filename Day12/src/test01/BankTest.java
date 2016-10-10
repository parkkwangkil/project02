package test01;

public class BankTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(10000,"park","1111");
		BankAccount account2 = new BankAccount(1000, "kwang", "333");
//		int money =10000;
//		account.deposit(money);
//		money = 500;
//		account.withdraw(money);
//		
//		account.printAccount();

		
		account.tranfer(account2, 500);
		account.printAccount();
		account2.printAccount();
	}
	
	
	
	
	}

