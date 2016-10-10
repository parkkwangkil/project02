package work02;

public class Novel extends Book {
	private String novelTitle;
	private String novelAuthor;
	private int novelNumber;

	public Novel(String title, String author, int number, String novelTitle, String novelAuthor, int novelNumber) {
		super(number,title, author);
		this.novelTitle = novelTitle;
		this.novelAuthor = novelAuthor;
		this.novelNumber = novelNumber;
	}

	public String getNoveltitle() {
		return novelTitle;
	}

	public void setNoveltitle(String noveltitle) {
		this.novelTitle = noveltitle;
	}

	public String getNovelauthor() {
		return novelAuthor;
	}

	public void setNovelauthor(String novelauthor) {
		this.novelAuthor = novelauthor;
	}

	public int getNovelnumber() {
		return novelNumber;
	}

	public void setNovelnumber(int novelnumber) {
		this.novelNumber = novelnumber;
	}

	public int getLateFee(int Novellate) {
		return Novellate * 200;
	}

}
