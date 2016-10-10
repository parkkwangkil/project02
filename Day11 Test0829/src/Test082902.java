import java.util.Scanner;

public class Test082902 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = 3661/60;
	//	int minute = 3661/60/60;
		int minute = 3661%(60*60)/60;
	//  int second = 3661/60% 60;
		int second = 3661% (60*60)%60;

	    System.out.println("시간은"+hour+"분은"+minute+"초는"+second);
		
	}

}
