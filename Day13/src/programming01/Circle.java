package programming01;

public class Circle {
	static String color="피아노블랙";
	double radius;
	private double height;

	public Circle(double radius, double height) {
		this.radius = radius;
		this.height = height;
		this.color=color;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public double getArea(){
		return radius * 3.14;
	}
	
	public String toString(){
		return "방지름"+radius+"색상"+color; 
	}

}