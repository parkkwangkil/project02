package test02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ǭ ��ȣ �Է�");
		String productNum = sc.next();

		boolean isOK = true;

		if (productNum.length() == 6) {
			// ���� ���ڸ��� ���ĺ����� �˻��ϴ� �ݺ���
			for (int i = 0; i < 2; i++) {
				char c = productNum.charAt(i); // ���� �� �ϳ� �޴´�.
				if ((c < 'a' || c > 'z') && (c < 'A' && c > 'Z')) {
					isOK = false;
				}
			}

			// ���� ���ڸ��� �������� �˻��ϴ� �溹��
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
			System.out.println("�ùٸ���");
		} else {
			System.out.println("Ʋ����");

		}

	}
}
