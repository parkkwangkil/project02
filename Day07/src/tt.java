import java.util.Scanner;

public class tt {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;

		System.out.print("��ǰ ��ȣ�� �Է����ּ��� : ");
		s = scan.nextLine();

		if (s.length() == 6) {
			if (s.substring(0, 2).matches("[a-zA-Z]{2}") == true) {
				if (s.substring(2, 6).matches("[0-9]{4}") == true) {
					System.out.println("�ùٸ�  ��ǰ ��ȣ�Դϴ�.");
				} else {
					System.out.println("���ڰ� ���� �ʽ��ϴ�!");
				}
			} else {
				System.out.println("���ĺ��� ���� �ʽ��ϴ�!");
			}
		} else
			System.out.println("���ڿ��� ���̰� ���� �ʽ��ϴ�!");

	}
}