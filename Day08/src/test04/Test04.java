package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int[] numbers = new int[3]; // 3ĭ ¥�� �迭 ��ü ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����1�� ������ �Է�");
		numbers[0] = sc.nextInt(); // �迭 �ζ����� 0����
		System.out.println("����2�� ���� �� �Է�");
		numbers[1] = sc.nextInt();
		System.out.println("����3�� ������ �Է�");
		numbers[2] = sc.nextInt();
		
		int sum =(numbers[0]+numbers[1]+numbers[2]);
		System.out.println("�հ�="+sum);
		System.out.println("���="+(sum/3.0));

	}

}
