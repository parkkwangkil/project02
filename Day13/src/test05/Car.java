package test05;

public class Car {
	private int speed;
	private String color;
	private String model;

	public Car(int speed, String color, String model) {
		this.speed = speed;
		this.color = color;
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void print() {
		System.out.println("===");
		System.out.println("==");
		System.out.println("===");
	}

	@Override
	public String toString() {
		return "속도:" + speed + "색상" + color + "모델" + model;
	}
}