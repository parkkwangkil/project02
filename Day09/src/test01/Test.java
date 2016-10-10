package test01;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		// c.speed = 100;
		// c.model = "º¥Ã÷";
		// c.color = "silver";
		c.color = "Black";
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.model ="bmw";
		System.out.println(c.toString());

		Car c2 = new Car();
		c2.color = "SILVER";
		System.out.println(c2.toString());

	}
}
