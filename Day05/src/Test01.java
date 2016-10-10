import java.util.Scanner;



public class Test01 {
	public static void main(String[] args) {
		System.out.println("--합계 구하기 프로그램 입니다.--");

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int num = scan.nextInt();

		int sum=0;
		for (int i = 1; i <= num; i++) {
			sum = sum+i; // sum+=i;
			System.out.println(i+"까지의 합계 " + sum);
		}
		
		System.out.println("1부터 "+num+"까지의 총합="+sum);
	}
}



