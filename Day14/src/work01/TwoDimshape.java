package work01;

public class TwoDimshape extends Shape {
	private double area;
	double x;
	double y;
	double z;
	
	public TwoDimshape(String name, double x, double y ,double area){
		super(name,x,y);
		this.area=area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	} 
	
	public String toString(){
		return "¸éÀû"+area;
	}

	
	
	
	
	
	
}
