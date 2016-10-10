package work02;

public class ScienceFiction {
	private String sfTitle;
	private String sfAuthor;
	private int sfNumber;

	public ScienceFiction(String title, int number, String author, String sfTitle, String sfAuthor, int sfNumber) {
		this.sfTitle = sfTitle;
		this.sfAuthor = sfAuthor;
		this.sfNumber = sfNumber;

	}

	public void setSfTitle(String sfTitle) {
		this.sfTitle = sfTitle;
	}

	public void setSfAuthor(String sfAuthor) {
		this.sfAuthor = sfAuthor;
	}

	public void setSfNumber(int sfNumber) {
		this.sfNumber = sfNumber;
	}

	public String getSfTitle() {
		return sfTitle;
	}

	public String getSfAuthor() {
		return sfAuthor;
	}

	public int getSfNumber() {
		return sfNumber;
	}
	
	public int getLateFee(int SfLate) {
		return SfLate * 600;
	}
}
