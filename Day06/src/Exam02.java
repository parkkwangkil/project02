import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Scanner sc = new Scanner(System.in);
	 int hour , min , sec;
	 System.out.println("���Է�");
	 int input_second = sc.nextInt();
	 
	 hour = input_second/(60*60);
	 min = input_second%(60*60)/60;
	 sec = input_second%60;
	 
	 System.out.println(hour+"�ð�"+min+"��"+"��"+sec);

	}

}
