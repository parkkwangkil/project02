package programming04;

public class Point {
	private int x;
	private int y;
	
	void setX(int x){
		x = x;
	}
	int getX(){
		return x;
	}
	
	void setY(int y){
		y = y;
	}
	int getY(){
		return y;
	}
	
	public String toString(){
		return x+" "+y;
	}
	
	void print(){
		System.out.printf(+x+" "+y);
	}

}
