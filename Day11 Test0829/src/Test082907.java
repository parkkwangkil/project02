import java.util.Scanner;

public class Test082907 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;

		System.out.println("���ڸ� �Է�");
		result = sc.nextInt();

		if (result < 0) {
			System.out.println("0���� ������ ���� �̴�.");
			
		}else{
			System.out.println("0���� Ŀ��"+result);

			if (result % 3 == 0) {
				System.out.println(+result + "�� 3�� ���");

			} else {
				System.out.println("0���� ������ ����.");
			}

		}
	}
}
