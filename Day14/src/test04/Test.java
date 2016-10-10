package test04;

public class Test {

	public static void main(String[] args) {
		System.out.println(calcArea(new Shape()));
		System.out.println(calcArea(new Rectangle(10, 20)));//오버라이딩 되면 자식 것을 실행
		System.out.println(calcArea(new Circle(5))); 
	}
	public static double calcArea(Shape s){
		return s.getArea(); // 부모 변수 
	}
}
