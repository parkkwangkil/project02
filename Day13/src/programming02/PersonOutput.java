package programming02;

public class PersonOutput {

	public static void main(String[] args) {
		Customer customer = new Customer("±¤±æ", "±¸¸®", "010-xxxx-yyyy", "123", 1);
		System.out.println(customer.name);
		System.out.println(customer.address);
		System.out.println(customer.call);
		System.out.println(customer.custnum);
		System.out.println(customer.mile);
		

	}

}
