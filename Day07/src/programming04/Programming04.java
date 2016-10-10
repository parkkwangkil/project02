package programming04;

import java.util.Scanner;

public class Programming04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char ch;
		int word=1;
		
		System.out.println("문자열 입력 :");
		str = sc.nextLine();
		
		for (int i=0; i<str.length(); i++){
			
			ch = str.charAt(i);
			if (ch == ' ')
				word ++;
		}
		System.out.println("단어의 수 :" + word);
	}

	}

