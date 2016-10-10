package work01;

public class ThreeDimshape extends Shape{
	private double volume;
	double x;
	double y;
	double z;
	
	public ThreeDimshape(double x, double y, double z, double volume){
		super();
		this.volume=volume;
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
	
	
	@Override	
	public double getVolume() {
		return volume;
	}

}
