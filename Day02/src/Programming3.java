import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է�:");
		double radius = scan.nextDouble();
		
		double volume1 = 4.0/3*radius*radius*radius;
		double volume2 = 4.0/3*Math.pow(radius, 3);
		
		System.out.println("���Ǵ� "+volume1);
		System.out.println("���Ǵ� "+volume2);
	}
}
