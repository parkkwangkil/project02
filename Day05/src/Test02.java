import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("������ ����� �� �Է�:");
		int dan = scan.nextInt();

//		for (int i=1; i<=9; i++) {
//			// ex) 3*1=3
//			if (i % 2 == 1) {
//				int result = dan * i;
//				System.out.println(dan + "x" + i + "=" + result);
//			}else{
//				System.out.println("i ¦��:"+i);
//			}
//		}
		
		int i;
		for(i=1; i<=9; i=i+2){
			int result = dan * i;
			System.out.println(dan + "x" + i + "=" + result);
		}
	}
}






