package Lab;

public class CircleMain {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		circle.getArea(0);
		circle.getParameter();
		System.out.println(circle.getArea(0));
		System.out.println(circle.getParameter());
	//	square(10.0); // �ν��Ͻ� ������ ��ü�� �����ؾ� �� 
			System.out.println(circle.getPi());
		}
}
