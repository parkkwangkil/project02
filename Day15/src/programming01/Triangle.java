package programming01;

public class Triangle implements Moveable {
	int weight;
	int height;
	
	void Triangle(){
		
	}
	
	@Override
	public void move(int dx, int dy) {
		this.weight=weight;
		this.height=height;
		System.out.printf("Triangle"+weight * height);
		
	}
}
	