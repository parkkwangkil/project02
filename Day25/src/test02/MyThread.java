package test02;

public class MyThread implements Runnable {

	@Override
	public void run() {
		//현재 클래스의 객체 쓰레그가 해야하는 일 작성
		for(int i=0; i<100000; i++){
			System.out.println("thread i:" +i);
		}

	}

}
