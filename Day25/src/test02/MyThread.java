package test02;

public class MyThread implements Runnable {

	@Override
	public void run() {
		//���� Ŭ������ ��ü �����װ� �ؾ��ϴ� �� �ۼ�
		for(int i=0; i<100000; i++){
			System.out.println("thread i:" +i);
		}

	}

}
