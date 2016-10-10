package test02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("물푼 범호 입력");
		String productNum = sc.next();

		boolean isOK = true;

		if (productNum.length() == 6) {
			// 앞의 두자리가 알파벳인지 검사하는 반복문
			for (int i = 0; i < 2; i++) {
				char c = productNum.charAt(i); // 문자 값 하나 받는다.
				if ((c < 'a' || c > 'z') && (c < 'A' && c > 'Z')) {
					isOK = false;
				}
			}

			// 뒤의 네자리가 숫자인지 검사하는 방복문
			for (int i = 2; i < 6; i++) {
				char c = productNum.charAt(i);
				if (c < '0' || c > '9') {
					isOK = false;
				}

			}
		} else {
			isOK = false;
		}

		if (isOK == true) {
			System.out.println("올바르다");
		} else {
			System.out.println("틀리다");

		}

	}
}
