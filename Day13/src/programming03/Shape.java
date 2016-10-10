package programming03;

public class Shape {
	double side;
	double height;
	double area;

	double pi = 3.14;

	public void Shape(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String toString() {
		return "위치" + side +"크기"+height+"지역"+area;
	}
}
