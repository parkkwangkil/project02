import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수입력 (0보다 큰수):");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.println("0보다 큰 수만 가능");
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

