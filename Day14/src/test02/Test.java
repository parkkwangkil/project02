package test02;

public class Test {

	public static void main(String[] args) {
//		Rectangle r = new Rectangle(10, 20);
//		Triangle t = new Triangle(10, 20);
//		Circle c = new Circle(10);
//		
//		System.out.println(r.getArea());
//		System.out.println(t.getArea());
//		System.out.println(c.getArea());

///////////////////////////////////////////////////////////
		Shape s = new Circle(10);
		System.out.println(s.getArea()); // 자동으로 원을 구한다.
		// circle이 쓰인다.
///////////////////////////////////////////////////////////
		
		Shape[] shape = new Shape[3];
		shape[0] = new Rectangle(10, 20);
		shape[1] = new Triangle(10, 20);
		shape[2] = new Circle(10);
		
		for (int i=0; i<shape.length; i++){
			System.out.println(shape[i].getArea());
		}

	}
	

}
