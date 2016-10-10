package test04;

public class SportsCar extends Car{
	private boolean isTurbo=false;
	
	public SportsCar(){
		// 만약 이 자리에 super가 자동으로 들어간다. 
		super(100,"피아노 블랙","아이폰7");
		System.out.println("sportsCar 생성자() 호출");
	
		
	}

}
