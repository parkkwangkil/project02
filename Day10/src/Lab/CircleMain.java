package Lab;

public class CircleMain {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		circle.getArea(0);
		circle.getParameter();
		System.out.println(circle.getArea(0));
		System.out.println(circle.getParameter());
	//	square(10.0); // 인스턴스 변수를 객체를 생성해야 함 
			System.out.println(circle.getPi());
		}
}
