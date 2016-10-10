package test05;

public class Car {
	private String color="basic";
	private String model="benz";
	private int speed = 0;
	////////////////////////////////////////
	public void speedUp(){
		speed +=10;
	}
	public void speedUp(int s){
		speed +=5;
	}
	
	public String toString(){
		return "색상:" +color+",모델:"+model+"속도"+speed ;
	}

}
