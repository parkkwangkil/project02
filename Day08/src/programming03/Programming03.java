package programming03;

import java.util.Scanner;

public class Programming03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int student;
		System.out.print("학생의 수를 입력 하시오: ");
		student = sc.nextInt();
		int[] number = new int[student];
		for (int i = 0; i < number.length; i++) {
			System.out.print("학생" + (i + 1) + "성적을 입력하시오:");
			number[i] = sc.nextInt();
			if (number[i] > 100 || number[i] < 0) {
				System.out.println("잘못된 성적 " + "입니다. 다시 입력하세요");
				i--;
			}
		}
		for (int i = 0; i < number.length; i++)
			total += number[i];
		System.out.println("평균성적은" + (double) total / number.length + "입니다.");
	}
}