package test04;

public class Student {
	int number;
	String name;
	int hp;
	int classNumber;
	
	public Student (int number, String name, int hp, int classNum){
		this.name = name;
		this.number = number;
		this.hp = hp;
		this.classNumber= classNumber;
		
	}
	
	public String toString(){
		return name + number + hp + classNumber; 
	}

}

