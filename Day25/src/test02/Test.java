package test02;

public class Test {

	public static void main(String[] args) {
		//MyThread ttt = new MyThread();
		//Thread tt = new Thread(t);
		Thread t = new Thread(new MyThread());
		
		t.start();
		
		for(int i=0; i<10000; i++){
			System.out.println("main i" +i);
		}

	}

}
