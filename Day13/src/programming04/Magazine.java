package programming04;

public class Magazine extends Book {
	private String date;

	public Magazine(String title, String author, int page, String date) {
		super(title, author, page);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String toString() {
		return  "���� :"+" "+title+"�۰� :"+" "+author+"������ ��:"+" "+ page+ "���� :" + date;

	}
}