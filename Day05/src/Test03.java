import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		// ����ڰ� �Է��� ������ �������� ����ϱ�
		Scanner scan = new Scanner(System.in);

		System.out.println("������ ����� �� �Է�:");
		int dan = scan.nextInt();
		
		for(int i=9; i>0; i--){
			int result = dan*i;
			System.out.println(dan + "x" + i + "=" + result);
		}
	}
}
