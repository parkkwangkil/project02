package programming01;

public class TestCylinder {

	public static void main(String[] args) {
			Cylinder cylinder = new Cylinder(1,1);
			Cylinder cylinder2 = new Cylinder(5.0, 3.0);
			System.out.println("������"+cylinder.getRadius());
			System.out.println("����"+cylinder.getHeight());
			System.out.println("����"+cylinder.getVolume());
			System.out.println("����"+cylinder.getArea());
			System.out.println("����"+cylinder.getColor());
			
			System.out.println("������2"+cylinder2.getRadius());
			System.out.println("����2"+cylinder2.getHeight());
			System.out.println("����2"+cylinder2.getVolume());
			System.out.println("����2"+cylinder2.getArea());
			System.out.println("����2"+cylinder2.getColor());
	}

}
