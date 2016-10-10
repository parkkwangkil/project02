package test11;

public class Test11 {

	public static void main(String[] args) {
	}
	public void countDown(){
		for(int i=10; i>0; i--){
			System.out.println("카운트"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("스레드 슬립 도중에 예외 발생");
				e.printStackTrace();
			}
		}
		System.out.println("발사");
			
		}
		

	}


