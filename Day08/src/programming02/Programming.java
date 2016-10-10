package programming02;

public class Programming {

	public static void main(String[] args) {
		Histomgram h = new Histomgram(10);
		for (int i = 0; i < 10; i++) {
			h.input();
		}
		System.out.println("--------------");
		h.print();
		System.out.println("--------------");
	}
}