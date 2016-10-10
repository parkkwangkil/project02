package programming01;

public class Rectangle implements Moveable {
	int width;
	int height;
	void Rectangle(){
		
	}
	@Override
	public void move(int dx, int dy) {
		this.width = width;
		this.height = height;
		
		System.out.printf("Rectangle"+width*height/2);
		
	}
	

		
	}
	
