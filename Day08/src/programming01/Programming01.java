package programming01;

import java.util.Scanner;

public class Programming01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] re = new int[10];
		int a, b = 0;

		while (true) {
			System.out.print("좌석을 예약하시겠습니까?(1 또는 0)");
			a = sc.nextInt();
			if (a == 1) {
				System.out.println("현재의 예약 상태는 다음과 같습니다.");
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
				System.out.print("몇번째 좌석을 예약하시겠습니까?");
				b = sc.nextInt();
			} else if (a == 0) {
				System.out.println("예약을 종료합니다.");
				break;
			}
			for (int i = 0; i < re.length + 1; i++) {
				if (i == b) {
					if (re[i - 1] == 1) {
						System.out.println("이미 예약된 자리입니다.");
						break;
					} else {
						re[i - 1] = 1;
						System.out.println("예약되었습니다.");
						break;
					}
				}
			}
		}
	}
}