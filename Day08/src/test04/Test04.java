package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int[] numbers = new int[3]; // 3칸 짜리 배열 객체 선언
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직원1의 월급을 입력");
		numbers[0] = sc.nextInt(); // 배열 인텓스는 0부터
		System.out.println("직원2의 월급 을 입력");
		numbers[1] = sc.nextInt();
		System.out.println("직원3의 월급을 입력");
		numbers[2] = sc.nextInt();
		
		int sum =(numbers[0]+numbers[1]+numbers[2]);
		System.out.println("합계="+sum);
		System.out.println("평균="+(sum/3.0));

	}

}
