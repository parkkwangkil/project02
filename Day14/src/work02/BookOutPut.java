package work02;

public class BookOutPut {

	private static final int Novellate = 200;
	private static final int PoetLate = 300;
	private static final int SfLate = 600;

	public static void main(String[] args) {

		Book book = new Book(0, "�ڱ���", "�ڱ���");
		Novel nbook = new Novel("����", "����", 1, "����1", "����2", 1);
		Poet pbook = new Poet("����", 2, "����", "����3", "����3", 2);
		ScienceFiction sfbook = new ScienceFiction("����", 1, "����", "����1", "����2", 1);

		System.out.println(book.getNumber());
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());

		System.out.println(nbook.getNoveltitle());
		System.out.println(nbook.getNovelauthor());
		System.out.println(nbook.getNovelnumber());
		System.out.println(nbook.getLateFee(Novellate));

		System.out.println(pbook.getPoetTitle());
		System.out.println(pbook.getPoetAuthor());
		System.out.println(pbook.getPoetNumber());
		System.out.println(pbook.getLateFee(PoetLate));

		System.out.println(sfbook.getSfTitle());
		System.out.println(sfbook.getSfAuthor());
		System.out.println(sfbook.getSfNumber());
		System.out.println(sfbook.getLateFee(SfLate));
	}
}