import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
//		do{
//			System.out.print("양수 입력:");
//			num = scan.nextInt();			
//		}while(num>0);
		
		while(true){
			System.out.print("양수 입력:");
			num = scan.nextInt();
			
			if(num<=0)
				break;
		}

		System.out.println("0또는 음수를 입력해서 종료되었습니다.");
	}
}



