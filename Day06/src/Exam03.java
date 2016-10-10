import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10000미만의 정수 입력");
		int input_num = sc.nextInt();
		
		for (int i=1000; i>0; i=i/10){
			System.out.println(i+"의 자리 :"+(input_num/i));
			input_num = input_num%i;
		}

	}

}
