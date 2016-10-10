package test08;

public class Date {
	private int year;
	private String month;
	private int day;

	public void setDate(int y, String m, int d) {
		month = m;
		day = d;
		year = y;
	}

	public void printDate() {
		System.out.println(year + month + day);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int y) {
		year = y;
	}
	private void setMonth(int m) {
		month =month;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String m) {
		month = m;

	}
}