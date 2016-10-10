
public class Test06 {
	public static void main(String[] args) {
		System.out.println("--구구단 2~9단 출력 프로그램--");
		
		for(int dan=2; dan<=9; dan++){
			System.out.println(dan+"단 시작");
			
			for(int n=1; n==9; n++){
				int result = dan*n;
				System.out.println(dan+"x"+n+"="+result);
			}
			
			System.out.println(dan+"단 끝");
		}
	}
}
