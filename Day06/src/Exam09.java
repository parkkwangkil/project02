
public class Exam09 {

	public static void main(String[] args) {
		System.out.println();
		int n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2 +" ");
		for (int i = 0; i < 20; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
			
		}

	}

}
