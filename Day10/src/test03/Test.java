package test03;

public class Test {
// static Car 에만 소속 되고 다른 곳에는 소속 되지 않은 것 
	public static void main(String[] args) {
//		System.out.println(Car.numofCars);
//		
//		Car.numofCars = 10;
//		
//		Car c1 = new Car();
//		Car c2 = new Car();
//		
//		System.out.println(c1.numofCars);
//		System.out.println(c2.numofCars);
		
		// 서로 변수를 공유
		System.out.println("Car클래스 객체의 수 : "+ Car.getNumOfCars());
		Car c1 = new Car();
		Car c2 = new Car(10,"RED","BMW");
		
		System.out.println("car 클래스의 객체의 수 :" +Car.numOfCars);
		
		System.out.println(new Test().square(3));
	}// 자바는 객체라서 실행 하시 위해서는 위와 같이 선언을 해주면 사용 가능  
	// 객체를 많이 만들 필요 없을 떄 사용하는 것 static
	
	public int square(int n){
		return n*n;
	}

}
