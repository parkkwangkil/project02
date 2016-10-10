import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name; // 문자열을 관리하는 클래스 참조변수
		int age;
		
		System.out.println("이름 입력");
		name = sc.nextLine();
		System.out.println("나이 입력");
		age = sc.nextInt();
		
		System.out.println(name+"님 hi"+"나이"+age+"세");
		

	}

}
