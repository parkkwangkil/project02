package programming01;

import java.io.InputStream;
import java.util.Scanner;

public class CircleProgramming01 {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ãâ·Â");
		double area = 1	;
		circle.setArea(area);
		System.out.println(area);
		int cx = 2;
		circle.setCx(cx);
		System.out.println(cx);
		int c = 2;
		int cy = 2;
		circle.setCy(cy);
		System.out.println(cy);
		double pi=3.14;
		circle.setPi(pi);
		System.out.println(pi);
		int r = 2;
		circle.setR(r);
		System.out.println(r);
		double radius = 3;
		circle.setRadius(radius);
		System.out.println(radius);
	
		
		System.out.println(+pi+"*"+radius+"*"+radius);
		System.out.println(cx * cy);

	}

	

}
