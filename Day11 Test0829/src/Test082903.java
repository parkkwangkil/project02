import java.util.Scanner;

public class Test082903 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input;
		int chunwon;
		int Baegwon;
		int sipwon;
		int ilwon;
		System.out.println("������ �Է��ϼ���");
		input = sc.nextInt();
		System.out.println("õ���ڸ� ");
		chunwon = sc.nextInt();
		System.out.println("�����ڸ�");
		Baegwon = sc.nextInt();
		System.out.println("�����ڸ�");
		sipwon = sc.nextInt();
		System.out.println("�����ڸ�");
		ilwon = sc.nextInt();

		if (input > 0 || input < 1000) {

			System.out.println("õ���ڸ�:"+chunwon);
			System.out.println("�����ڸ�:"+Baegwon);
			System.out.println("�����ڸ�:"+sipwon);
			System.out.println("�����ڸ�:"+ilwon);

		} else {
			System.out.println("����");
		}

	}
}
