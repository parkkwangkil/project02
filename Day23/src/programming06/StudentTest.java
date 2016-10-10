package programming06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections.*;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			list.add(new Student("name", "address", "phone"));
		}
		Collections.sort(list);
		int s = Collections.binarySearch(list, new Student("name4", "address4", "phone4"));
		System.out.println(s);
	}
}