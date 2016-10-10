package work01;

public class Triangle extends TwoDimshape {
	private int width, height;
	private double area;

	public Triangle(String name, int x, int y, int width, int height) {
		super(name, x, y, y);
		this.width = width;
		this.height = height;
		this.area = area;

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea1() {
		return width * height / 2;

	}
}