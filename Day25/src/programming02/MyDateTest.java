package programming02;

import java.util.Date;

public class MyDateTest {

	public static void main(String[] args) throws InterruptedException {
		Date d = new Date();
		while (true) {
			System.out.println("hi" + d);
			Thread.sleep(1000);
		}

	}

}
