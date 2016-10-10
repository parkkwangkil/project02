package programming01;

public class Shape implements Moveable{
	int x; 
	int y;
	
	public void shape(){
		
	}
	@Override
	public void move(int dx, int dy) {
		this.x = dx;
		this.y = dy;
		System.out.printf("move"+ x+y);		
	}

	
}
