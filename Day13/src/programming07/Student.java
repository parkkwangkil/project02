package programming07;

public class Student {
	private String name;
	private int num;
	private String major;
	private int grade;
	private double score;
	
	public Student(String name, int num, String major, int grade, double score){
		this.name =name;
		this.num=num;
		this.major=major;
		this.grade=grade;
		this.score=score;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStunum() {
		return num;
	}
	public void setStunum(int stunum) {
		this.num = stunum;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public String toString(){
		return "�̸� :"+name+"�й� : "+num+"�Ҽ� :"+major+"�а� :"+grade+"����"+score;
	}

}
