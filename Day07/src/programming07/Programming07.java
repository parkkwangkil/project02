package programming07;

import java.util.Scanner;

public class Programming07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id ="aaa";
		String pw="111";
		String equal_id=null;;
		String equal_pw = null;
		
		System.out.println("id �Է��ϼ���:");
		equal_id = sc.nextLine();
		System.out.println("pw �Է��ϼ���:");
		equal_pw = sc.nextLine();
		
		if(!(equal_id.equals(id))){
			System.out.println("id ����");			
		}else if (!(equal_pw.equals(pw))){
			System.out.println("pw ����");
		}else
			System.out.println("����");
		}
		

	}
