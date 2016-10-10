package programming06;

public class BankAccountProgramming07 {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		BankAccount myAccount2 = new BankAccount();
		myAccount.desosit(1000);
		System.out.println(myAccount);
		myAccount.withdraw(8000);
		System.out.println(myAccount);
		myAccount.transfer(100, myAccount2);
		System.out.println(myAccount);
		System.out.println(myAccount2);



	}

}
