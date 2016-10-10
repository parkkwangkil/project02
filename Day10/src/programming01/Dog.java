package programming01;

public class Dog {
	private String name = "ÃÊ·Õ";
	private String breed = "½ºÇÇÃ÷";
	private int age = 4;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public Dog() {
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}
}
