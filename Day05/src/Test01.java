import java.util.Scanner;



public class Test01 {
	public static void main(String[] args) {
		System.out.println("--�հ� ���ϱ� ���α׷� �Դϴ�.--");

		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num = scan.nextInt();

		int sum=0;
		for (int i = 1; i <= num; i++) {
			sum = sum+i; // sum+=i;
			System.out.println(i+"������ �հ� " + sum);
		}
		
		System.out.println("1���� "+num+"������ ����="+sum);
	}
}



