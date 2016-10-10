package programming01;

public class Circle {
	private int r;
	private int cx;
	private int cy;
	private double pi =3.14;
	private double radius;
	private double area;
	
	void setR(int r){
		r=r;
	}
	int getR(){
		return r;
	}
	void setPi(double pi){
		pi = pi;
	}
	double getPi(){
		return pi;
	}
	
	void setCy(int cy){
		cy = cy;
	}
	int getCy(){
		return cy;
	}
	
	void setCx(int cx){
		cx = cx;
	}
	int getCx(){
		return cx;
	}
	void setArea(double area){
		area = area; 
	}
	double getArea(){
		return area;
	}
	void setRadius(double radius){
		radius = radius;
	}
	
	double getRadius(){
		return radius;
	}
	
	public String toString(){
		return +radius+"*"+radius+"*"+pi; 
	}
	
	

}
