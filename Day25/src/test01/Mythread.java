package test01;

public class Mythread extends Thread{
	@Override
	public void run(){
		// ���� Ŭ������ ������ ������ ��ü�� �ؾ��ϴ� �۾� �ۼ�
		for (int i=0; i<10000000; i++){
			System.out.println("thread i :" +i);
			
		}
	}

}
