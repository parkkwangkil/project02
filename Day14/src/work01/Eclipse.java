package work01;

public class Eclipse extends TwoDimshape {
	private int radius;
	private static double area;
	
	
		
	public Eclipse(String name, double x, double y, double area, int radius) {
	
		
		super(name, area, area, area);	
		
		this.radius=radius;
		this.area = area;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public int getRadius() {
		return radius;
	}

	
	
	public double getArea2(){
		return radius*radius*3.14;
	}
	

}