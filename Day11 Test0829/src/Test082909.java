
public class Test082909 {

	public static void main(String[] args) {
		long a = 0;
		long b = 1;
		long c;
		int i;

		for (i = 2; i < 100; i++) {
			System.out.print(a + " ");
				c = a + b;
				a = b;
				b = c;
				//System.out.println(c);

			
		}
	}
}