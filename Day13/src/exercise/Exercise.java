/* 
package exercise;

public class Exercise {

1. Student 
1-1 GraduateStudent
 
1-2 Student 
       + number    
       + name
                     ���� ȭ��ǥ
       GramduateStudent
       + lab
1-3 

class Student
public String name;
private int number;

public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public class GranduateStudent extends Student
public String lab;

public String getLab() {
	return lab;
}

public void setLab(String lab) {
	this.lab = lab;
}

1-4 public Student (String name, int number){
	this.name = name;
	this.number = number;

    public GranduateStudent (String lab){
    super("�ڱ���",1);
    this.lab = lab;
    }

1-5 s.number�� private�� �Ǿ� �־ ��� ���� ���Ѵ�.    
    
}

2-1 Class B�� public void methodOne(int i){}
2-2 Class B�� publid static void methodFour(int i){} 
2-3

class ClassA{
	public void methodOne(int i){}
	// ���� �޼ҵ�� �ν��Ͻ� �޼ҵ� ȣ�� �Ұ�
	
	public void methodTwo(int i){}
	public static void methodThree(int i){}
	public static void methodFour(int i){}
	
	
 class ClassB extends ClassA{
		public void methodOne(int i){}
		public void methodTwo(int i){}
		// �ν��Ͻ� �޼ҵ�� ���� �޼ҵ带 �����Ұ�
		public static void methodThree(int i){}
		public static void methodFour(int i){}
 }
}

3.
	package exercise;

	public class Bike{
		private int gear;
		public int speed;
	}

	public class MountainBike expends Bike { // extends
	 	// class�� �ΰ� �� �ʿ� ����. 
		public int seatHeight;

		public void MountainBike(int g) { // �����ڴ� void ���� ���ִ°� �ƴϴ�.
			super();
			gear = g;
		}

	}
	
4.
package exercise;

class Animal{
	String name;
	public Animal(){
		name = "UNKNOWN";
		System.out.println("�����Դϴ�."+name);
		}
	public Animal(String name){
		this.name = name;
		System.out.println("�����Դϴ�."+name);
	}
}
class Lion extends Animal{
	public Lion(){
	System.out.println("�����Դϴ�.");	
	}
	public Lion(String name){
		super(name);
		System.out.println("�����Դϴ�.");
	}
}
public class Test {

	public static void main(String[] args) {
		Lion lion=new Lion("Brave");
		Lion lion2 = new Lion();

	}

}
�� 
�����Դϴ�.Brave
�����Դϴ�.
�����Դϴ�.UNKNOWN
�����Դϴ�.	
*/ 
	
	