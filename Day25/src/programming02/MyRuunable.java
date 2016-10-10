package programming02;

import java.util.Date;

public class MyRuunable implements Runnable {
	private String name;

	public MyRuunable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		Date d = new Date();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(d + name);
		}
	}
}
