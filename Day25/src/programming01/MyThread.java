package programming01;

public class MyThread extends Thread {
	private int date;
	private String dates;

	public void run() {
		for (int i = 1; i < 1; i--) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);

		}
	}
}
