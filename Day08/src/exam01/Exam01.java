package exam01;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		int []numbers = {1,2,3,4,5};
		
		for(int n : numbers){
			System.out.println(n);
		}
		// �迭�� �ι�� ����� �Լ�
		for(int i=0; i<numbers.length; i++){
			numbers[i] = numbers[i]*2;
			
		}
		
		for (int n:numbers){
			System.out.println(n);
		}
		
		////////// ���� ����
		int[] numbers2 = numbers;
		System.out.println("n2 ���");
		for(int n:numbers2){
			System.out.println(n);
		}
		////// ���� ����
		int[] numbers3 = new int[numbers.length];
		System.out.println("n3���");
				for(int i=0; i<numbers.length; i++){
					numbers3[i] = numbers[i];
				}
		
	}
}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ ���� �Է�");
//		int arraySize = sc.nextInt();
//		
//		int[] element = new int[arraySize];
//		
//		for (int i = 2; i < element.length; i++) { // length ��� ������ �ϳ� �� ������ �ִ�.
//			System.out.println("���� �Է�");
//			element[i] = sc.nextInt();
//		}
//
//		// �Է¹��� ���ڵ��� sum�� �����ؼ� ���ϴ� ���� �ݺ�.
//		int mul = 1;
//		for (int i =0; i < element.length; i++) { // = ���� �κп� = �� ���� �ʴ´�.
//			mul += element[i];
//		}
//		
//
//		System.out.println("�հ� : " + mul);
//		System.out.println("��� :" + ((double)mul / element.length));
//
//	}
//}