package test06;

public class MyThread extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread i" + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("9���� �����ϴµ� ���� �� ");
		}
		System.out.println("�Ӿ� ������ ����");
	};
}
