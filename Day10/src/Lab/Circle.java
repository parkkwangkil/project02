package Lab;

public class Circle {
	private double radius;
	//1
	private double pi = 3.141592;

	//2
	public Circle(double r){
		radius =r;
	}
	
	//3
	public void setRdius(){
		radius = radius;
	}
	public void setPi(){
		pi = pi;
	}
	//4
	public double square(double r){
		return r*r;
	}
	
	public double getArea(double r){
		return pi *square(r);
	}
	
	public double getParameter(double p){
		return radius*radius*3.14;
		
	}
	
	//5
	public double getRdius(){
	return radius;
	}
	public double getPi(){
		return pi;
	}
	//6
	public double getParameter(){
		return radius * radius *pi;
	}
	
	
	
	
	
	

}
