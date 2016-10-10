package work02;

public class Book {
	private int number;
	private String title;
	private String author;
	
	public Book(int number, String title, String author){
	this.number=number;
	this.title=title;
	this.author=author;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public boolean equals(Object obj){
		if(this.number == ((Book)obj).getNumber()){
			return  true;
		}else{
			return false;
		}
	}

}
