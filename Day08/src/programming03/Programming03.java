package programming03;

import java.util.Scanner;

public class Programming03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int student;
		System.out.print("�л��� ���� �Է� �Ͻÿ�: ");
		student = sc.nextInt();
		int[] number = new int[student];
		for (int i = 0; i < number.length; i++) {
			System.out.print("�л�" + (i + 1) + "������ �Է��Ͻÿ�:");
			number[i] = sc.nextInt();
			if (number[i] > 100 || number[i] < 0) {
				System.out.println("�߸��� ���� " + "�Դϴ�. �ٽ� �Է��ϼ���");
				i--;
			}
		}
		for (int i = 0; i < number.length; i++)
			total += number[i];
		System.out.println("��ռ�����" + (double) total / number.length + "�Դϴ�.");
	}
}