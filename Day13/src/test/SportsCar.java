package test;

public class SportsCar extends Car {
	public boolean isTurbo;
	
	public void printCar(){
//		System.out.println("속도:"+speed);
//		System.out.println("색상:"+color);
//		System.out.println("모델:"+model);
		super.printCar();
		System.out.println("터보모드:"+isTurbo);
	}

}
