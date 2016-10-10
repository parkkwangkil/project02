package test01;

public class Main {

	public static void main(String[] args) {
		Mythread t = new Mythread();
	//	t.run(); 이거 쓰면 안된다.
		t.start();
		
		for(int i=0; i<100000000; i++){
			System.out.println(i);
		}

	}

}
