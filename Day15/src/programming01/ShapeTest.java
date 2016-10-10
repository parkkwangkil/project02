package programming01;

public class ShapeTest {

	public static void main(String[] args) {
		Moveable[] mv = new Shape[4];
		for (int i = 0; i < mv.length; i++) {

			mv[0] = new Triangle();
			mv[1] = new Rectangle();
			mv[2] = new Circle();
			mv[3] = new Shape();
			
			int n1 = (int) ((Math.random()*46)+1);
			int n2 = (int) ((Math.random()*46)+1);
			
			mv[i].move(n1, n2);


		}

	}

}
