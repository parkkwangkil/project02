package test03;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("000-0000-0000", "�ڱ���", "11111", 3.5);
		Student s2 = new Student("000-0000-0010", "�ڱ���", "11112", 3.2);
		System.out.println(s2.compareTo(s1));

		/////////////////////
		Student[] student = new Student[5];

		student[0] = new Student("000-0000-0000", "�ڱ���1", "11111", 3.5);
		student[1] = new Student("000-0000-0000", "�ڱ���2", "11112", 3.4);
		student[2] = new Student("000-0000-0000", "�ڱ���3", "11113", 3.3);
		student[3] = new Student("000-0000-0000", "�ڱ���4", "11114", 3.2);
		student[4] = new Student("000-0000-0000", "�ڱ���5", "11115", 3.1);
		//student[5] = new Student("000-0000-0000", "�ڱ���6", "11116", 3.0);

		// Arrays.sort(student);
		Arrays.sort(student);

		System.out.println(student[1]);

	}
}
