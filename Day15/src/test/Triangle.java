package test;

public class Triangle extends Shape {
	private int width, height;
	
	public Triangle (int w, int h){
		width = w;
		height = h;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

}