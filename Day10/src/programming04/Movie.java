package programming04;

public class Movie {
	private String title;
	private String author;
	private String production;

	public Movie() {

	}

	public Movie(String title, String author, String production) {
		this.title = title;
		this.author = author;
		this.production = production;
	}

	// set �� ����

//	public Movie(String t, String a) {
//		title = title;
//		author = author;
//		production = production;
//	}

	public void Movie2(String t, String a, String p) {
		title = title;
		author = author;
		production = production;	}

	public void setTitle(String t) {
		title = title;
	}

	public void setAuthor(String a) {
		author = author;
	}

	public void setProduction(String p) {
		production = production;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getProduction() {
		return production;
	}

	public String toString() {
		return "���� : " + getTitle()+ title+ " �۰�" + getAuthor()+author + "���ۻ�" + getProduction()+production;
	}

}
