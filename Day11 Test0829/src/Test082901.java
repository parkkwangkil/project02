import java.util.Scanner;

public class Test082901 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int x = 1;
		int y = 2;
		int z = 3;
		int sum = x+y+z;
		
		System.out.print("첫번째 숫자를 입력 하세요 :");
		x = sc.nextInt();
		System.out.print("두번째 숫자를 입력 하세요 :");
		y = sc.nextInt();
		System.out.print("세번쨰 숫자를 입력 하세요 :");
		z = sc.nextInt();
		
		System.out.println("숫자의 편균은"+sum/3+"입니다.");
		
	}

}
