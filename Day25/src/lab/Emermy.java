package lab;

public class Emermy extends GraphicObject {
	int dx = 10;

	public Emermy(String name) {
		super(name);
		x = 500;
		y = 0;
	}

	public void update() {
		x += dx;
		if (x < 0)
			dx = +10;
		if (x > 500)
			dx = -10;
	}
}



