package programming03;

import java.util.Scanner;

class Programming03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alphabet = 0;
		int math = 0;
		int gap = 0;
		String str;
		char ch;

	   System.out.println("입력 :");
		str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || ((ch >= 'A' && ch <= 'Z'))){
				alphabet++;
			}else if (ch >= '0' && ch <= '9'){
				math++;
			}else if (ch == ' ') 
				gap++;
			}
			System.out.println("알파벳:" + alphabet);
			System.out.println("숫자 :" + math);
			System.out.println("공백:" + gap);
		}
	}

