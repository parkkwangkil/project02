package test02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrint {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		System.out.println(simpledateformat.format(now));

	}

}
