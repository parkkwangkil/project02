package test05;

import java.util.Scanner;

public class Test05 {
	//
	// public static void main(String[] args) {
	// int[] numbers = new int[3];
	// Scanner sc = new Scanner(System.in);
	//
	// for (int i = 0; i < 3; i++) {
	// System.out.println("���� �Է�");
	// numbers[i] = sc.nextInt();
	// }
	//
	// // �Է¹��� ���ڵ��� sum�� �����ؼ� ���ϴ� ���� �ݺ�.
	// int sum = 0;
	// for (int i = 0; i < 3; i++) {
	// sum += numbers[i];
	// }
	//
	// System.out.println("�հ� : " + sum);
	// System.out.println("��� :" + (sum / 3));
	//
	// }
	//
	// }

//	public static void main(String[] args) {
//		final int NUMBER_COUNT =3;
//		int[] numbers = new int[NUMBER_COUNT];
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < NUMBER_COUNT; i++) { // �ݺ��� 
//			System.out.println("���� �Է�");
//			numbers[i] = sc.nextInt();
//		}
//
//		// �Է¹��� ���ڵ��� sum�� �����ؼ� ���ϴ� ���� �ݺ�.
//		int sum = 0;
//		for (int i = 0; i < NUMBER_COUNT; i++) {
//			sum += numbers[i];
//		}
//		
//
//		System.out.println("�հ� : " + sum);
//		System.out.println("��� :" + (sum / NUMBER_COUNT));
//
//	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ũ�� �Է� ");
		int arraySize = sc.nextInt();
		
		int[] numbers = new int[arraySize]; // ����ڰ� �� ���� 
		

		for (int i = 0; i < numbers.length; i++) { // length ��� ������ �ϳ� �� ������ �ִ�.
			System.out.println("���� �Է�");
			numbers[i] = sc.nextInt();
		}

		// �Է¹��� ���ڵ��� sum�� �����ؼ� ���ϴ� ���� �ݺ�.
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) { // = ���� �κп� = �� ���� �ʴ´�.
			sum += numbers[i];
		}
		

		System.out.println("�հ� : " + sum);
		System.out.println("��� :" + ((double)sum / numbers.length));

	}
}