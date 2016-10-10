package lab;

public class Student extends Human{
    private	String major;
//	 protected major;
//	 private major;
	private String Student;
	
	public Student(String name, int age, String major){
		super(name, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString(){
		return "Á÷¾÷"+major;
	}
	
	public String getProfession(){
		return this.Student;
	}


}
