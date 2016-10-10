import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int PRICE = 100;
		double totalPrice;
		int count;
		
		System.out.println("¸î°³?");
		count = sc.nextInt();
		
		if(count >=10){
			totalPrice = count * PRICE * 0.9;
		}else{
			totalPrice = count * PRICE; 
		}
		
		System.out.println("ÃÑ±Ý¾× "+totalPrice);

	}


}
