package test12;

public class test12 {

	public static void main(String[] args) {
		try {
			countDown();
		} catch (InterruptedException e) {
			System.out.println("예외처리를 카운트 아운이 위임 ");
			e.printStackTrace();

		}
	}

	private static void countDown() throws InterruptedException {
		for (int i = 10; i > 0; i--) {
			System.out.println("카운트" + i);
			Thread.sleep(1000);
		}
		System.out.println("발사");

	}
}