package test;

public class Car {

	public int speed;
	public String color;
	public String model;

	public void speedUp() {
		speed += 10;
	}

	public void speedDown() {
		speed -= 10;
	}
	
	public void printCar(){
		System.out.println("�ӵ�:"+speed);
		System.out.println("����:"+color);
		System.out.println("��:"+model);
	}

}
