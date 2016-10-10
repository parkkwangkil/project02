import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		// 사용자가 입력한 구구단 역순으로 출력하기
		Scanner scan = new Scanner(System.in);

		System.out.println("구구단 출력할 단 입력:");
		int dan = scan.nextInt();
		
		for(int i=9; i>0; i--){
			int result = dan*i;
			System.out.println(dan + "x" + i + "=" + result);
		}
	}
}
