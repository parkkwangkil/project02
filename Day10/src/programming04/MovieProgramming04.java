package programming04;

public class MovieProgramming04 {

	public static void main(String[] args) {
		Movie movie = new Movie("�ڹ�","�ȵ���̵�", "�����ӿ�ũ");
		Movie movie2 = new Movie("�Ｚ", "sds", "902");
		
		movie.setTitle("�ڹ�");
		movie.setAuthor("�����ӿ�ũ");
		movie.setProduction("�ȵ���̵�");
		movie.getTitle();
		movie.getAuthor();
		movie.getProduction();
		movie2.setTitle("�Ｚ");
		movie2.setAuthor("sds");
		movie2.setProduction("902");
		movie2.getTitle();
		movie2.getAuthor();
		movie2.getProduction(); 
		
		System.out.println(movie.toString());
		System.out.println(movie2.toString());

	}

}
