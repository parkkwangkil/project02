package test01;

// vo , dao , bean 으로 불리우는 형태의 클래스 
// 여러 정보를 하나의 객체에 담아서 전달하거나 저장할 때 사용 됨 
// 아래는 책 한권에 대한 정보 5가지를 하나의 객체에 저장할 수 있도록 
// 클래스를 설계 하였음 
public class BookVO {
	 private int bookId;
	    private String title;
	    private String publisher;
	    private String year;
	    private int price;
	/////////////////////////////////////////////////////////////
	    public BookVO(){}
	     
	    public BookVO(int bookId, String title, String publisher, String year, int price) {
	        this.bookId = bookId;
	        this.title = title;
	        this.publisher = publisher;
	        this.year = year;
	        this.price = price;
	    }
	     
	    public BookVO(String title, String publisher, String year, int price) {
	        this.title = title;
	        this.publisher = publisher;
	        this.year = year;
	        this.price = price;
	    }
	    
	    public BookVO(int bookId, String year, int price) {
	        this.bookId = bookId;
	        this.year = year;
	        this.price = price;
	    }
	/////////////////////////////////////////////////////////////   
	    public int getBookId() {
	        return bookId;
	    }
	    public void setBookId(int bookId) {
	        this.bookId = bookId;
	    }
	    public String getTitle() {
	        return title;
	    }
	    public void setTitle(String title) {
	        this.title = title;
	    }
	    public String getPublisher() {
	        return publisher;
	    }
	    public void setPublisher(String publisher) {
	        this.publisher = publisher;
	    }
	    public String getYear() {
	        return year;
	    }
	    public void setYear(String year) {
	        this.year = year;
	    }
	    public int getPrice() {
	        return price;
	    }
	    public void setPrice(int price) {
	        this.price = price;
	    }
	//////////////////////////////////////////////////////////////
	    @Override
	    public String toString() {
	        return "BookVO [bookId=" + bookId + ", title=" + title + ", publisher=" + publisher + ", year=" + year
	                + ", price=" + price + "]";
	    }
	}