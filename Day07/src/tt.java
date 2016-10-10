import java.util.Scanner;

public class tt {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;

		System.out.print("물품 번호를 입력해주세요 : ");
		s = scan.nextLine();

		if (s.length() == 6) {
			if (s.substring(0, 2).matches("[a-zA-Z]{2}") == true) {
				if (s.substring(2, 6).matches("[0-9]{4}") == true) {
					System.out.println("올바른  물품 번호입니다.");
				} else {
					System.out.println("숫자가 맞지 않습니다!");
				}
			} else {
				System.out.println("알파벳이 맞지 않습니다!");
			}
		} else
			System.out.println("문자열의 길이가 맞지 않습니다!");

	}
}