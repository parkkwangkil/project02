package programming04;

import java.util.Scanner;

public class Programming04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hexa2Bin hex = new Hexa2Bin();
		String a;
		System.out.print("16진수 문자열을 입력하시오: ");
		a = sc.nextLine();
		System.out.print("\"" + a + "\"에 대한 이진수는 ");
		hex.print(a);
		System.out.println("입니다.");

	}

}
