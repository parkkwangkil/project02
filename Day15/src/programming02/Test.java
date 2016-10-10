package programming02;

public class Test {

	public static void main(String[] args) {
		Drawable[] draw = new Drawable[4];
		for(int i=0; i<draw.length; i++){
			
			draw[0] = new Shape();
			draw[1] = new Triangle();
			draw[2] = new Circle();
			draw[3] = new Rectangle();
			
			draw[i].draw();
			
					
			
		}

	}

}
