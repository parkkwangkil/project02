import java.util.Scanner;

public class Test082903 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input;
		int chunwon;
		int Baegwon;
		int sipwon;
		int ilwon;
		System.out.println("정수를 입력하세요");
		input = sc.nextInt();
		System.out.println("천의자리 ");
		chunwon = sc.nextInt();
		System.out.println("백의자리");
		Baegwon = sc.nextInt();
		System.out.println("십의자리");
		sipwon = sc.nextInt();
		System.out.println("일의자리");
		ilwon = sc.nextInt();

		if (input > 0 || input < 1000) {

			System.out.println("천의자리:"+chunwon);
			System.out.println("백의자리:"+Baegwon);
			System.out.println("십의자리:"+sipwon);
			System.out.println("일의자리:"+ilwon);

		} else {
			System.out.println("오류");
		}

	}
}
