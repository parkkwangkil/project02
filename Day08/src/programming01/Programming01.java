package programming01;

import java.util.Scanner;

public class Programming01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] re = new int[10];
		int a, b = 0;

		while (true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
			a = sc.nextInt();
			if (a == 1) {
				System.out.println("������ ���� ���´� ������ �����ϴ�.");
				System.out.println("-------------------------");
				for (int i = 0; i < seat.length; i++) {
					System.out.printf("%d ", seat[i]);
				}
				System.out.println("");
				System.out.println("-------------------------");
				for (int i = 0; i < re.length; i++) {
					System.out.print(re[i]);
				}
				System.out.println("");
				System.out.print("���° �¼��� �����Ͻðڽ��ϱ�?");
				b = sc.nextInt();
			} else if (a == 0) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			for (int i = 0; i < re.length + 1; i++) {
				if (i == b) {
					if (re[i - 1] == 1) {
						System.out.println("�̹� ����� �ڸ��Դϴ�.");
						break;
					} else {
						re[i - 1] = 1;
						System.out.println("����Ǿ����ϴ�.");
						break;
					}
				}
			}
		}
	}
}