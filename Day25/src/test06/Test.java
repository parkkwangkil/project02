package test06;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("����");
		
		
		MyThread t = new MyThread();
		System.out.println("10ī��Ʈ ���� �� ����");
		t.start();
		
		System.out.println("2�� �� �� �����ϰھ�");
		Thread.sleep(2000);
		t.interrupt();
		t.join();
		System.out.println("���� ��");
	}

}
