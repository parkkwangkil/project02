package test10;

import java.util.Scanner;

public class Test10 {

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

		} catch (ArithmeticException ex) {// 위에서 끝나서 여기선 쓸 필요 없다
			System.out.println("두번쨰 숫자에 0 입력을 거절한다.");
		} catch (Exception ex) {
			System.out.println("나누기 말고 다른 예외 발생");
			System.out.println("에러" + ex.getMessage()); // 부모 참조변수가 뒤로

		} finally { // 오류가 발생해도 무조건 실행 해준다.

			System.out.println("끝");

		}
	}
}
