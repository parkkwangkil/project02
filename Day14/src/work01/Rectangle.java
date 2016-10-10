package work01;

public class Rectangle extends TwoDimshape {
	private int width, height;
	private double area;

	public Rectangle(String name, double x, double y, double z, int width, int height) {
		super(name, x, y, z);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
    
	public double getArea3() {
		return width * height;

	}
}