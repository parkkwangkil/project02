package exam01;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		int []numbers = {1,2,3,4,5};
		
		for(int n : numbers){
			System.out.println(n);
		}
		// 배열을 두배로 만드는 함수
		for(int i=0; i<numbers.length; i++){
			numbers[i] = numbers[i]*2;
			
		}
		
		for (int n:numbers){
			System.out.println(n);
		}
		
		////////// 얕은 복사
		int[] numbers2 = numbers;
		System.out.println("n2 출력");
		for(int n:numbers2){
			System.out.println(n);
		}
		////// 깊은 복시
		int[] numbers3 = new int[numbers.length];
		System.out.println("n3출력");
				for(int i=0; i<numbers.length; i++){
					numbers3[i] = numbers[i];
				}
		
	}
}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("원소의 값을 입력");
//		int arraySize = sc.nextInt();
//		
//		int[] element = new int[arraySize];
//		
//		for (int i = 2; i < element.length; i++) { // length 라는 변수를 하나 더 가지고 있다.
//			System.out.println("숫자 입력");
//			element[i] = sc.nextInt();
//		}
//
//		// 입력받은 숫자들을 sum에 누적해서 더하는 것을 반복.
//		int mul = 1;
//		for (int i =0; i < element.length; i++) { // = 조건 부분에 = 가 들어가지 않는다.
//			mul += element[i];
//		}
//		
//
//		System.out.println("합계 : " + mul);
//		System.out.println("평균 :" + ((double)mul / element.length));
//
//	}
//}