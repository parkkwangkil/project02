package test06;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("시작");
		
		
		MyThread t = new MyThread();
		System.out.println("10카운트 시작 후 실행");
		t.start();
		
		System.out.println("2초 후 널 방해하겠어");
		Thread.sleep(2000);
		t.interrupt();
		t.join();
		System.out.println("메인 끝");
	}

}
