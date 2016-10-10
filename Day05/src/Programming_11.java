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
		System.out.print("연도를 입력하세요 : ");
		year = sc.nextInt();
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		System.out.print("일을 입력하세요 : ");
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
			result = "일";
			break;
		case 1:
			result = "월";
			break;
		case 2:
			result = "화";
			break;
		case 3:
			result = "수";
			break;
		case 4:
			result = "목";
			break;
		case 5:
			result = "금";
			break;
		case 6:
			result = "토";
			break;
		};
		
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + result + "요일 입니다.");
//		daysOfYears[y-1980] = total_days;
//		}
		
//		for(int i = 0; i<daysOfYears.length-1; i++){
//			System.out.println((i+1980)+"/"+(daysOfYears[i+1]-daysOfYears[i]));
//		}
	}
}
