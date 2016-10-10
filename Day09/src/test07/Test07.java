package test07;

public class Test07 {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		myAccount.desosit(1000);
		System.out.println(myAccount);
		myAccount.withdraw(8000);
		System.out.println(myAccount);

	}

}
