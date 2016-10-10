package programming06;

import java.util.Scanner;



public class length {
	String str;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력:");
		str = sc.nextLine();

	}

	public void count() {
		int vowel = 0;
		int consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
			case 'A':
			case 'b':
			case 'B':
			case 'c':
			case 'C':
			case 'd':
			case 'D':
				vowel++;
				break;
			case ' ':
				break;
			default:
				consonant++;
				break;
			}
			System.out.println("모음의 수 :" + vowel + "자음의 수 :" + consonant);
		}
	}
}
