package test01;

public class Mythread extends Thread{
	@Override
	public void run(){
		// 현재 클래스로 생성된 쓰레드 객체가 해야하는 작업 작성
		for (int i=0; i<10000000; i++){
			System.out.println("thread i :" +i);
			
		}
	}

}
