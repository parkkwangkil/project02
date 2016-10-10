package work02;

public class Poet extends Book {
	private String PoetTitle;
	private String PoetAuthor;
	private int PoetNumber;
	
	public Poet(String title, int number, String author, String PoetTitle, String PoetAuthor, int PoetNumber){
	super(number, title ,author);
	this.PoetNumber = PoetNumber;
	this.PoetAuthor=PoetAuthor;
	this.PoetTitle=PoetTitle;
	}
	
	public void setPoetTitle(String poetTitle) {
		PoetTitle = poetTitle;
	}
	public void setPoetAuthor(String poetAuthor) {
		PoetAuthor = poetAuthor;
	}
	public void setPoetNumber(int poetNumber) {
		PoetNumber = poetNumber;
	}
	public String getPoetTitle() {
		return PoetTitle;
	}
	public String getPoetAuthor() {
		return PoetAuthor;
	}
	public int getPoetNumber() {
		return PoetNumber;
	}
	
	public int getLateFee(int PoetLate) {
		return PoetLate * 300;
	}

}
