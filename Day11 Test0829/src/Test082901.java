import java.util.Scanner;

public class Test082901 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int x = 1;
		int y = 2;
		int z = 3;
		int sum = x+y+z;
		
		System.out.print("ù��° ���ڸ� �Է� �ϼ��� :");
		x = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է� �ϼ��� :");
		y = sc.nextInt();
		System.out.print("������ ���ڸ� �Է� �ϼ��� :");
		z = sc.nextInt();
		
		System.out.println("������ �����"+sum/3+"�Դϴ�.");
		
	}

}
