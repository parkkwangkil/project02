package test03;

public class Test {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		System.out.println(calcArea(r));

		Triangle t = new Triangle(10, 20);
		System.out.println(calcArea(t));

//		Circle c = new Circle(10);
//		System.out.println(calcArea(c));
		
		System.out.println(calcArea(new Circle(10))); // �̷��� �� �� �ִ�.
	}

	public static double calcArea(Shape s) { // �θ��ּҶ� ���� �ִ� �ڽ� �ּ� �� ���� �� �ִ�.
		double result = 0;
		
		
		if (s instanceof Rectangle) {
			result = ((Rectangle) s).getWidth() * ((Rectangle) s).getHeight();

		}else if(s instanceof Triangle){
			Triangle tri = (Triangle)s; // triange ��ü�ε� ����ȯ�� rectangle�� �ϸ� �ȵȴ�.
			result = tri.getWidth() * tri.getHeight()/2;
//			result = ((Triangle) s).getWidth() * ((Rectangle)s).getHeight()/2;
		}else if(s instanceof Circle){
			Circle cir=(Circle)s;
			result = cir.getRadius() * cir.getRadius() * 3.14;
		}
		return result;

	}
}