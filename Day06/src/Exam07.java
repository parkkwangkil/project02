import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�����Է� (0���� ū��):");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.println("0���� ū ���� ����");
		} else {

//			for (int i = 1; i < num; i++) {
//				if (i % 3 == 0) {
//					System.out.println(i);
			
			for (int i=3; i<num; i=i+3){
				System.out.println(i);
				}
			}

		}
	}

