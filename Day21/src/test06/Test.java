package test06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

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

		} catch (ArithmeticException ex) {
			System.out.println("�ι��� ���ڿ� 0 �Է��� �����Ѵ�.");
		} catch (InputMismatchException ex) {
			System.out.println("�� ������ ��尨�� ��� ");
		}

		System.out.println("��");

	}
}
