import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
//		do{
//			System.out.print("��� �Է�:");
//			num = scan.nextInt();			
//		}while(num>0);
		
		while(true){
			System.out.print("��� �Է�:");
			num = scan.nextInt();
			
			if(num<=0)
				break;
		}

		System.out.println("0�Ǵ� ������ �Է��ؼ� ����Ǿ����ϴ�.");
	}
}



