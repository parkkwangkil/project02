package work01;

public class Cube extends ThreeDimshape {
	private int side;
	
	public Cube(double name, double x, double y, double z , double volume, int side) {
		super(name ,x,  y, volume);
		this.side=side;
	}

	
	@Override
	public double getVolume() {
		return x * y * z;
	}

}
