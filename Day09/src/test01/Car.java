package test01;

public class Car {
	public int speed;
	public String color;
	public String model;
	
	public void speedUp(){
		speed +=10;
	}
	
	public void  speedDown() {
		speed -=10;
	}
	
	public String toString(){
		return "����" +color+"��"+model+"�ӵ�"+speed;
	}

	
}
