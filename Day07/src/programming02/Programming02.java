package programming02;

import java.util.Scanner;

public class Programming02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String area;
		int num;
		double result;

		System.out.println("�������� ���� �Է� :");
		num = sc.nextInt();

		while (true) {
			System.out.println("���� �Է��ϼ���");
			num = sc.nextInt();
			result = 3.14 * num * num;
			System.out.println("������ ���� "+result);

			System.out.println(" ��� �� �ǰ���? y/n");
			area = sc.nextLine();
			area = sc.nextLine();

			area.toUpperCase();
			if (area.equals("N"))
				break;
			else if (area.equals("Y")) {

			}else
			System.out.println("����");
		}
		
	}
}
