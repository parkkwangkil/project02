import java.util.Scanner;

public class Test082906 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int Rate =100;
		int sale;
		int pay;
		
		System.out.println("������ �Է��ϼ���");
		pay = sc.nextInt();
		System.out.println("ǰ���� �Է��ϼ���");
		sale = sc.nextInt();
		
		if (sale > 100)
			pay = sale * 10 + (int) (100*1.0);
		else 
			pay = sale * 100%10;
		System.out.println(pay);
	}
}
			
			
		