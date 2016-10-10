package test03;

public class SportsCar extends Car{
	private boolean isTurbo;
	
	public SportsCar(){
	//	super(); // 부모 생성자 호출
		System.out.println("sportsCar 클래스 생성자 호출");
		isTurbo = false;
	}

	
}
