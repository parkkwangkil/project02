package excercise;

public class MyJobTest {

	public static void main(String[] args) {
		Thread t =  new Thread(new MyJob());
		t.start();
		t.interrupt();

	}

}
