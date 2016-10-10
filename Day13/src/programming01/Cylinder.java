package programming01;

public class Cylinder extends Circle{
 private double height;  //³ôÀÌ
 
// public Cylinder(double radius){
//	 super(radius);
// }

 public Cylinder(double radius, double height){
	 super(radius);
	 this.height=height;
 }

public Cylinder(double radius) {
	 super(radius);
	 }

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}
 
public double getVolume(){
	return getArea()*height;
}

}
