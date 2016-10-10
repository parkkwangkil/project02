package programming02;

public class MyRunableTest {

	public static void main(String[] args) {
		Thread t1 = new Thread (new MyRuunable("hi"));
		Thread t2 = new Thread (new MyRuunable("Bye"));
		t1.start();
		t2.start();


	}

}
