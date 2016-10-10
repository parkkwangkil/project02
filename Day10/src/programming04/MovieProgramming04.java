package programming04;

public class MovieProgramming04 {

	public static void main(String[] args) {
		Movie movie = new Movie("자바","안드로이드", "프레임워크");
		Movie movie2 = new Movie("삼성", "sds", "902");
		
		movie.setTitle("자바");
		movie.setAuthor("프레임워크");
		movie.setProduction("안드로이드");
		movie.getTitle();
		movie.getAuthor();
		movie.getProduction();
		movie2.setTitle("삼성");
		movie2.setAuthor("sds");
		movie2.setProduction("902");
		movie2.getTitle();
		movie2.getAuthor();
		movie2.getProduction(); 
		
		System.out.println(movie.toString());
		System.out.println(movie2.toString());

	}

}
