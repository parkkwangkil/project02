package test01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c =  new Car();
		// Car c;
		//c = new Car;
		
		c.speed = 200;
		c.echo = true;
		c.mileage = 10000000;
		c.model ="º¥Ã÷";
		
		c.printCarStatus(); 
		
		Car c2 = new Car();
		c2.speed = 300;
		c2.mileage = 0;
		c2.echo = false;
		c2.model = "bmw";
		
		c2.printCarStatus();

	}

}
