package test02;

public class Test {

	public static void main(String[] args) {
		System.out.println();
		
		///////////////////
		
		Car myCar = new Car();

		myCar.speed = 100;
		myCar.model = "º¥Ã÷";

		myCar.speedUp(20);
		myCar.speedUp(30);
		myCar.speedUp(50);
//		
//		myCar.speedDown();
//		myCar.speedDown();
//		myCar.speedDown();
//		
//		myCar.speedUp();
//		myCar.speedUp();

		String result = myCar.toString();

		System.out.println(result);
		
		myCar.speedDown(90);
		myCar.speedDown(80);
//		myCar.speedUp();
//		myCar.speedUp();
		
	
		result = myCar.toString();
		System.out.println(result);
		
		

	}

}
