import java.util.Scanner;

public class Test082907 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;

		System.out.println("숫자를 입력");
		result = sc.nextInt();

		if (result < 0) {
			System.out.println("0보다 작으면 오류 이다.");
			
		}else{
			System.out.println("0보다 커서"+result);

			if (result % 3 == 0) {
				System.out.println(+result + "는 3의 배수");

			} else {
				System.out.println("0보다 작으면 오류.");
			}

		}
	}
}
