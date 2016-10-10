package programming05;

public class BankAccountProgramming {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount("¹Ú±¤±æ",1000,2000,3000);
		BankAccount bank2 = new BankAccount("¹Ú±¤±æ",123,456,3.14);
	
		
		System.out.println(bank.toString());
		System.out.println(bank2.toString());

	}

}
