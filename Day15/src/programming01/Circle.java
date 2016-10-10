package programming01;

public class Circle implements Moveable {
	int radius;

	@Override
	public void move(int dx, int dy) {
		this.radius = radius;
		System.out.println("radius"+radius*radius*radius);
		
	}

	
	}
