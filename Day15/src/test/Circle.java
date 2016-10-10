package test;

public class Circle extends Shape{
	private int radius;
	
	public Circle(int r){
		radius = r;
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius * radius * 3.14;
	}


}
