import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력:");
		int n1 = scan.nextInt();
		
		System.out.println("두번째 수 입력:");
		int n2 = scan.nextInt();
		
		int sum = n1-n2;
		
		System.out.println("두 수의 합계 >> "+ sum);
	}
}
