package test11;

public class Test11 {

	public static void main(String[] args) {
	}
	public void countDown(){
		for(int i=10; i>0; i--){
			System.out.println("ī��Ʈ"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("������ ���� ���߿� ���� �߻�");
				e.printStackTrace();
			}
		}
		System.out.println("�߻�");
			
		}
		

	}


