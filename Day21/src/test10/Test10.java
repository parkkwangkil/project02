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

			result = n1 / n2; // ArithmeticException �߻�

			System.out.println(result);

		} catch (ArithmeticException ex) {// ������ ������ ���⼱ �� �ʿ� ����
			System.out.println("�ι��� ���ڿ� 0 �Է��� �����Ѵ�.");
		} catch (Exception ex) {
			System.out.println("������ ���� �ٸ� ���� �߻�");
			System.out.println("����" + ex.getMessage()); // �θ� ���������� �ڷ�

		} finally { // ������ �߻��ص� ������ ���� ���ش�.

			System.out.println("��");

		}
	}
}
