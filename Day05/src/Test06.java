
public class Test06 {
	public static void main(String[] args) {
		System.out.println("--������ 2~9�� ��� ���α׷�--");
		
		for(int dan=2; dan<=9; dan++){
			System.out.println(dan+"�� ����");
			
			for(int n=1; n==9; n++){
				int result = dan*n;
				System.out.println(dan+"x"+n+"="+result);
			}
			
			System.out.println(dan+"�� ��");
		}
	}
}
