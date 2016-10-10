package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		// String s = "Hello hi bye";
		// for (int i=0; i<s.length(); i++){
		// System.out.println(s.charAt(i));

		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력");
		String inputString = sc.nextLine();

		int countAlphaber = 0;
		int countNum = 0;
		int countSpace = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				countAlphaber++;
			} else if (c >= '0' && c <= '9') {
				countNum++;
			} else if (c == ' ') {
				countSpace++;
			}
		}
		System.out.println("알파뷁 :" + countAlphaber);
		System.out.println("숫자 :" + countNum);
		System.out.println("공백 :" + countSpace);

	}
}
