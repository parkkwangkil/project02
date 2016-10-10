package test03;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2; // Car 는 참조 자료형 
		
		c2 = c1; // 선언된 c1의 주소를 받는다.
		
		c1.speed = 100;
		c1.model = "아우디";
		System.out.println(c2.toString()); //c2도 . 찍으면 같은 객체 
		
		c1 = null; // 주소 (변수의) 값이 없다면 가비지 컬렉터가 삭제 한다.
		c2 = null;
				

	}

}
