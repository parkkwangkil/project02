/* 
package exercise;

public class Exercise {

1. Student 
1-1 GraduateStudent
 
1-2 Student 
       + number    
       + name
                     위로 화살표
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
    super("박광길",1);
    this.lab = lab;
    }

1-5 s.number는 private로 되어 있어서 상속 받지 못한다.    
    
}

2-1 Class B의 public void methodOne(int i){}
2-2 Class B의 publid static void methodFour(int i){} 
2-3

class ClassA{
	public void methodOne(int i){}
	// 정적 메소드로 인스턴스 메소드 호출 불가
	
	public void methodTwo(int i){}
	public static void methodThree(int i){}
	public static void methodFour(int i){}
	
	
 class ClassB extends ClassA{
		public void methodOne(int i){}
		public void methodTwo(int i){}
		// 인스턴스 메소드는 정적 메소드를 지정불가
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
	 	// class가 두개 일 필요 없다. 
		public int seatHeight;

		public void MountainBike(int g) { // 생성자는 void 선언 해주는거 아니다.
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
		System.out.println("동물입니다."+name);
		}
	public Animal(String name){
		this.name = name;
		System.out.println("동물입니다."+name);
	}
}
class Lion extends Animal{
	public Lion(){
	System.out.println("사자입니다.");	
	}
	public Lion(String name){
		super(name);
		System.out.println("사자입니다.");
	}
}
public class Test {

	public static void main(String[] args) {
		Lion lion=new Lion("Brave");
		Lion lion2 = new Lion();

	}

}
답 
동물입니다.Brave
사자입니다.
동물입니다.UNKNOWN
사자입니다.	
*/ 
	
	