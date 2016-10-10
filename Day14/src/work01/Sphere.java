package work01;

public class Sphere extends ThreeDimshape {
	private int radius;

	public Sphere(String name, double x, double y, double z,double volume, int radius) {
		super(x, y,z,volume);
		this.radius = radius;
	}

	public int getZ() {
		return radius;
	}

	public void setZ(int z) {
		this.radius = radius;
	}

	@Override
	public double getVolume() {
		return (3.14 * 4 * x * x * x) / 3;

	}
}