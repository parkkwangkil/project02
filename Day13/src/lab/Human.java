package lab;

public class Human {
	
	private String name;
	 int age;
	private String human;
//	 protected String name;
//	 protected int age;
//	 private String name;
//	 private int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
	
	}
	
	public String getProfession(){
		return this.human;
	}

	public String toString() {
		return "�̸�" + name + "����" + age;
	}
//	public static void main(String[] args) {
//		Human human1 = new Human("����", 18);
//		Human human2 = new Human("����", 21);
//		Human human3 = new Human("���", 50);
//		System.out.println(human1);
//		System.out.println(human2);
//		System.out.println(human3);
//	}

}
