package test12;

public class test12 {

	public static void main(String[] args) {
		try {
			countDown();
		} catch (InterruptedException e) {
			System.out.println("����ó���� ī��Ʈ �ƿ��� ���� ");
			e.printStackTrace();

		}
	}

	private static void countDown() throws InterruptedException {
		for (int i = 10; i > 0; i--) {
			System.out.println("ī��Ʈ" + i);
			Thread.sleep(1000);
		}
		System.out.println("�߻�");

	}
}