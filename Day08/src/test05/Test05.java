package test05;

import java.util.Scanner;

public class Test05 {
	//
	// public static void main(String[] args) {
	// int[] numbers = new int[3];
	// Scanner sc = new Scanner(System.in);
	//
	// for (int i = 0; i < 3; i++) {
	// System.out.println("숫자 입력");
	// numbers[i] = sc.nextInt();
	// }
	//
	// // 입력받은 숫자들을 sum에 누적해서 더하는 것을 반복.
	// int sum = 0;
	// for (int i = 0; i < 3; i++) {
	// sum += numbers[i];
	// }
	//
	// System.out.println("합계 : " + sum);
	// System.out.println("평균 :" + (sum / 3));
	//
	// }
	//
	// }

//	public static void main(String[] args) {
//		final int NUMBER_COUNT =3;
//		int[] numbers = new int[NUMBER_COUNT];
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < NUMBER_COUNT; i++) { // 반복도 
//			System.out.println("숫자 입력");
//			numbers[i] = sc.nextInt();
//		}
//
//		// 입력받은 숫자들을 sum에 누적해서 더하는 것을 반복.
//		int sum = 0;
//		for (int i = 0; i < NUMBER_COUNT; i++) {
//			sum += numbers[i];
//		}
//		
//
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 :" + (sum / NUMBER_COUNT));
//
//	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기 입력 ");
		int arraySize = sc.nextInt();
		
		int[] numbers = new int[arraySize]; // 사용자가 준 값을 
		

		for (int i = 0; i < numbers.length; i++) { // length 라는 변수를 하나 더 가지고 있다.
			System.out.println("숫자 입력");
			numbers[i] = sc.nextInt();
		}

		// 입력받은 숫자들을 sum에 누적해서 더하는 것을 반복.
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) { // = 조건 부분에 = 가 들어가지 않는다.
			sum += numbers[i];
		}
		

		System.out.println("합계 : " + sum);
		System.out.println("평균 :" + ((double)sum / numbers.length));

	}
}