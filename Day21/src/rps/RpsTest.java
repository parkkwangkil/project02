package rps;

import java.util.Scanner;

public class RpsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rps rps = new Rps();
		int user;
		int pc = 0;

		System.out.println("C> JAVA ����");
		System.out.println("�ϳ��� �����Ͻÿ�: ����(0), ����(1), ��(2)");
		System.out.println("�Է�");
		user = sc.nextInt();

		if (user > pc) {
			System.out.println("�ΰ��¸�");
		} else if (pc > user) {
			System.out.println("��ǻ�ͽ¸�");
		} else {
			System.out.println("���");
		}

	
	}
}

// for (int i = 0; i < 3; i++) {
//
// if (user >= pc) {
// System.out.println("����¸�");
// } else if (user <= pc) {
// System.out.println("��ǻ�� ����");
// } else if(user == 2) {
// System.out.println("���");
//}else{
//	System.out.println("��");
// }
// if (user <= 1) {
// if (user <= 2) {
// if (user <= 3) {
// System.out.println("��ǻ�Ͱ� �̱�");
// }
// }
//
// } else if (user >= 1) {
// } else if (user >= 2) {
// } else if (user >= 3) {
// System.out.println("��ǻ�Ͱ� ��");
//
// } else if (user == 1) {
// } else if (user == 2) {
// } else if (user == 3) {
// System.out.println("���");
// }
// }
// }
// }
