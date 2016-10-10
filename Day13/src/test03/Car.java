package test03;

public class Car {
	private int speed;
	private String color;
	private String model;
		
	public Car(){
		speed = 0;
		color = "PIANO BLACK";
		model = "iPHONE7";
	}
	
	public void print(){
		System.out.println("1"+speed);
		System.out.println("2"+model);
		System.out.println("3"+color);
	}

}
