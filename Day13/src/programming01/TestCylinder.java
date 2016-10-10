package programming01;

public class TestCylinder {

	public static void main(String[] args) {
			Cylinder cylinder = new Cylinder(1,1);
			Cylinder cylinder2 = new Cylinder(5.0, 3.0);
			System.out.println("반지름"+cylinder.getRadius());
			System.out.println("높이"+cylinder.getHeight());
			System.out.println("부피"+cylinder.getVolume());
			System.out.println("지역"+cylinder.getArea());
			System.out.println("색상"+cylinder.getColor());
			
			System.out.println("반지름2"+cylinder2.getRadius());
			System.out.println("높이2"+cylinder2.getHeight());
			System.out.println("부피2"+cylinder2.getVolume());
			System.out.println("지역2"+cylinder2.getArea());
			System.out.println("색상2"+cylinder2.getColor());
	}

}
