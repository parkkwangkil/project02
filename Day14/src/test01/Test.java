package test01;

public class Test {

	public static void main(String[] args) {
		Car car = new SportsCar();
		((SportsCar)car).childMethod(); // �ڽ� Ŭ������ ����ȯ
		
		car.printCar();

	}

}
