package test03;

import javax.print.attribute.standard.MediaSize.Other;

public class Student implements Comparable {
	private double grade;
	private String name;
	private String StudentNum;
	private String phone;

	public Student(String n, String num, String p, double g) {
		super();
		this.name = name;
		this.StudentNum = StudentNum;
		this.phone = phone;
		this.grade = grade;
	}

	@Override
	public int compareTo(Object o) {
		if (this.grade > ((Student) o).grade)
			return 1;
		else if (this.grade < ((Student) o).grade)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Student [grade+ name + StudentNum + phone]";
	}
}
