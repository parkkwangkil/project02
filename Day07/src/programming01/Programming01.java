package programming01;

import java.util.Scanner;

public class Programming01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char ch = 0;
		int i = 0;

		System.out.println("�Rǰ �Է�");
		str = sc.nextLine();

		if (str.length() == 6) {
			for (i = 0; i < 6; i++) {
				ch = str.charAt(i);
				if ((i < 2) && ((ch <= 'a' || ch >= 'z')) && (ch <= 'A' || ch >= 'Z')) {
					System.out.println("���� ���");
					break;

				} else if ((i >= 2) && (ch <= '0' || ch >= '9')){
					System.out.println("���� �Է�");
				break;
			}

		}
		if (i == 6){
			System.out.println("�ùٸ� ��ȣ");
		}else
			System.out.println("Ʋ�� ��ȣ");
	}

}
}