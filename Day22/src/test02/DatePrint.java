package test02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrint {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		System.out.println(simpledateformat.format(now));

	}

}
