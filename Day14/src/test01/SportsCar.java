package test01;

public class SportsCar extends Car {
	private boolean turbo;

	public SportsCar() {
		super(0, "iphone", "zen black");
		turbo = false;

	}

	public SportsCar(int speed, String model, String color, boolean turbo) {
		super(speed, model, color);
		turbo = turbo;
	}

	public void childMethod() {
		System.out.println("자식 클래스가 추가 한 메소드");
	}
	@Override
	public void printCar() {
		super.printCar();
		System.out.println(turbo);
	}

}