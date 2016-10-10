import java.lang.reflect.Array;
import java.util.Scanner;

public class Programming_11 {
	public static void main(String args[]){
		int year, month, day;
		int total_days = 0;
		boolean isLeapYear = false;
		String result = "";

		Scanner sc = new Scanner(System.in);
		
		int[] daysOfYears = new int[40];
		
//		for(int y=1980; y<2016; y++){
//			total_days=0;
//			year = y;
//			month = 2;
//			day = 1;
		System.out.print("������ �Է��ϼ��� : ");
		year = sc.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		month = sc.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		day = sc.nextInt();
		
		total_days += (year - 1900) * 365;
		total_days += (year - 1900) / 4;
		
		if((year%4==0 && year%100!=0) || year%400==0){
			isLeapYear = true;
			if(month==1||month==2){
				total_days = total_days - 1;
			}
		}
		
		int[] daysOfMonth = new int [12];
		int days = 0;
		
		for (int i = 1; i <= daysOfMonth.length; i++) {
			switch (i) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				days = 31;
				break;
			case 4: case 6: case 9: case 11:
				days = 30;
				break;
			case 2: 
//				if(isLeapYear) days = 29;
//				else 
					days = 28;
				break;
			}
			daysOfMonth[i-1] = days;
		}
		
		int temp_days = day;

		for (int i = 0; i < month-1; i++) {
			temp_days += daysOfMonth[i];
		}
		total_days += temp_days;
		
		System.out.println(temp_days);
		System.out.println(total_days);
		
		switch (total_days%7) {
		case 0:
			result = "��";
			break;
		case 1:
			result = "��";
			break;
		case 2:
			result = "ȭ";
			break;
		case 3:
			result = "��";
			break;
		case 4:
			result = "��";
			break;
		case 5:
			result = "��";
			break;
		case 6:
			result = "��";
			break;
		};
		
		System.out.println(year + "�� " + month + "�� " + day + "���� " + result + "���� �Դϴ�.");
//		daysOfYears[y-1980] = total_days;
//		}
		
//		for(int i = 0; i<daysOfYears.length-1; i++){
//			System.out.println((i+1980)+"/"+(daysOfYears[i+1]-daysOfYears[i]));
//		}
	}
}
