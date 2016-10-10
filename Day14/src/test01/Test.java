package test01;

public class Test {

	public static void main(String[] args) {
		Car car = new SportsCar();
		((SportsCar)car).childMethod(); // 자식 클래스로 형변환
		
		car.printCar();

	}

}
