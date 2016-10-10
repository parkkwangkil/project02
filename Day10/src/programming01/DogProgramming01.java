package programming01;

public class DogProgramming01 {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();

		dog1.getAge();
		dog1.getName();
		dog1.getBreed();
		dog2.getName();
		dog2.getBreed();
		dog2.getAge();
		System.out.println(dog1.getName() + " " + dog1.getBreed() + " " + dog1.getAge());
		System.out.println(dog2.getName() + " " + dog2.getBreed() + " " + dog2.getAge());

	}

}
