package work01;

public class Cylinder extends ThreeDimshape  {
	private int radius, height;
	
	public Cylinder(String name, double x, double y, double z , double volume, int radius, int height) {
		super(x,y,z,volume);
		this.radius=radius;
		this.height=height;
	}

	@Override
	public double getVolume() {
		return 3.14*x*x*x/3;
	}
	

}
