package test07;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main ����");
		
		MyThread t = new MyThread();
		t.start();
		
		Thread.sleep(2000);
		
		t.setRun(false);
		System.out.println("main ����");

	}

}
