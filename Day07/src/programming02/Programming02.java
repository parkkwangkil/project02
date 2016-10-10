package programming02;

import java.util.Scanner;

public class Programming02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String area;
		int num;
		double result;

		System.out.println("원지름의 값을 입력 :");
		num = sc.nextInt();

		while (true) {
			System.out.println("값을 입력하세요");
			num = sc.nextInt();
			result = 3.14 * num * num;
			System.out.println("면적의 값은 "+result);

			System.out.println(" 계속 할 건가요? y/n");
			area = sc.nextLine();
			area = sc.nextLine();

			area.toUpperCase();
			if (area.equals("N"))
				break;
			else if (area.equals("Y")) {

			}else
			System.out.println("오류");
		}
		
	}
}
