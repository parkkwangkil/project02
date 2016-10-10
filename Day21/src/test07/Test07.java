package test07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test07 {

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
		} finally { // 오류가 발생해도 무조건 실행 해준다.

			System.out.println("끝");

		}
	}
}