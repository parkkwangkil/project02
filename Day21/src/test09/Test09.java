package test09;

public class Test09 {

	public static void main(String[] args) {
		double n = Math.sqrt(9);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { // 체크 예외
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1초 쉬었다");
		

	}

}
