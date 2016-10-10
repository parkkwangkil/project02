package rps;

import java.util.Scanner;

public class RpsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rps rps = new Rps();
		int user;
		int pc = 0;

		System.out.println("C> JAVA 게임");
		System.out.println("하나를 선택하시오: 가위(0), 바위(1), 보(2)");
		System.out.println("입력");
		user = sc.nextInt();

		if (user > pc) {
			System.out.println("인간승리");
		} else if (pc > user) {
			System.out.println("컴퓨터승리");
		} else {
			System.out.println("비김");
		}

	
	}
}

// for (int i = 0; i < 3; i++) {
//
// if (user >= pc) {
// System.out.println("사람승리");
// } else if (user <= pc) {
// System.out.println("컴퓨터 슨이");
// } else if(user == 2) {
// System.out.println("비김");
//}else{
//	System.out.println("끈");
// }
// if (user <= 1) {
// if (user <= 2) {
// if (user <= 3) {
// System.out.println("컴퓨터가 이김");
// }
// }
//
// } else if (user >= 1) {
// } else if (user >= 2) {
// } else if (user >= 3) {
// System.out.println("컴퓨터가 짐");
//
// } else if (user == 1) {
// } else if (user == 2) {
// } else if (user == 3) {
// System.out.println("비김");
// }
// }
// }
// }
