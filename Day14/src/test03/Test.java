package test03;

public class Test {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		System.out.println(calcArea(r));

		Triangle t = new Triangle(10, 20);
		System.out.println(calcArea(t));

//		Circle c = new Circle(10);
//		System.out.println(calcArea(c));
		
		System.out.println(calcArea(new Circle(10))); // 이렇게 쓸 수 있다.
	}

	public static double calcArea(Shape s) { // 부모주소라서 위에 있는 자식 주소 다 받을 수 있다.
		double result = 0;
		
		
		if (s instanceof Rectangle) {
			result = ((Rectangle) s).getWidth() * ((Rectangle) s).getHeight();

		}else if(s instanceof Triangle){
			Triangle tri = (Triangle)s; // triange 객체인데 형병환을 rectangle로 하면 안된다.
			result = tri.getWidth() * tri.getHeight()/2;
//			result = ((Triangle) s).getWidth() * ((Rectangle)s).getHeight()/2;
		}else if(s instanceof Circle){
			Circle cir=(Circle)s;
			result = cir.getRadius() * cir.getRadius() * 3.14;
		}
		return result;

	}
}