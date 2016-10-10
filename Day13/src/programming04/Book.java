package programming04;

public class Book {
	 String title;
	 String author;
	 int page;
	//private String date;

	// String date;
	public Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}

//	public Book(String title, String author, int page, String date) {
//		this.title = title;
//		this.author = author;
//		this.page = page;
//	//	this.date = date;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String toString() {
		return "제목 :"+" "+title+"작가 :"+" "+author+"페이지 수:"+" "+ page+ "일정:"+" ";//date;
	}

}
