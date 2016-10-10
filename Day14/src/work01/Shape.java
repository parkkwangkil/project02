package work01;

public class Shape {
	String name;
	double x;
	double y;

	public Shape() {
		x = y = 0;
	}

	public Shape(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String toString() {
		return "¿Ã∏ß" + name + " " + x + " " + y;
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return 10;
	}

	public double getVolume() {
		// TODO Auto-generated method stub
		return getVolume();
	}

}
