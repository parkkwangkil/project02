package test08;

public class Test {

	public static void main(String[] args) {
		BankAccout b = new BankAccout();
		
		User user1 = new User(b);
		User user2 = new User(b);
		
		user1.start();
		user2.start();

	}

}
