package test06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, result;
		try {
			System.out.println("n1");
			n1 = sc.nextInt(); // InputMismatchException
			System.out.println("n2");
			n2 = sc.nextInt(); // InputMismatchException

			result = n1 / n2; // ArithmeticException 발생

			System.out.println(result);

		} catch (ArithmeticException ex) {
			System.out.println("두번쨰 숫자에 0 입력을 거절한다.");
		} catch (InputMismatchException ex) {
			System.out.println("넌 나에게 모욕감을 줬어 ");
		}

		System.out.println("끝");

	}
}
