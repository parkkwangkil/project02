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
		System.out.println("�ڽ� Ŭ������ �߰� �� �޼ҵ�");
	}
	@Override
	public void printCar() {
		super.printCar();
		System.out.println(turbo);
	}

}