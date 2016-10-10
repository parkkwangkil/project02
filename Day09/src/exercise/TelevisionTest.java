package exercise;

public class TelevisionTest {

	public static void main(String[] args) {
		Television t = new Television();
		t.setModel("STV-101");
		System.out.println(t);
		String b = t.getModel();
		System.out.println(b);

	}

}
