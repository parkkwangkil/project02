package test02;

public class Test02 {

	public static void main(String[] args) {
		Car c = new Car();
	//	c.speed = 100; //private로 선언 되어 사용불가
		c.speedDown();
		c.speedUp();
		c.speedUp();
		System.out.println(c.toString());
		
		//c.color ="색상";
		c.setColor("고오올드");
		//System.out.println("배고파 졸려" +c.color);
		System.out.println("내 아이폰 6s의 색상 :"+" "+c.getColor());

		

	}

}
