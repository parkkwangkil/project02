package test02;

public class Car {
	private int speed;
	private String color;
	private String model;
	////
	public Car(int speed, String color, String model){
		this.speed = speed;
		this.color = color;
		this.model = model;
	}
	
	public Car(){
		this(0,"SILVER","BENTZ");
	}
	
	public void speedUp(int speed){
		this.speed += speed;
		// ���� ��� �� ���� ����� �߰� �Ѵٴ� ��
	}

}
