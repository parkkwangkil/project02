package programming04;

import java.util.Scanner;

public class Programming04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hexa2Bin hex = new Hexa2Bin();
		String a;
		System.out.print("16���� ���ڿ��� �Է��Ͻÿ�: ");
		a = sc.nextLine();
		System.out.print("\"" + a + "\"�� ���� �������� ");
		hex.print(a);
		System.out.println("�Դϴ�.");

	}

}
