package test04;

public class Car {
	private int speed;
	private String color;
	private String model;
	
	public Car(int speed, String color, String model){
		System.out.println("cAR 클래스 CAR(int , string , string) 생성자 호충");
		this.speed=speed;
		this.color=color;
		this.model=model;
		
	}
    public Car(int speed){
    	this.speed = speed;
    }
	
	public Car(){
		this(0,"piano black","iphone7");
		System.out.println("Car 클래스 호출");
	}

}
