package test03;

public class Test {
// static Car ���� �Ҽ� �ǰ� �ٸ� ������ �Ҽ� ���� ���� �� 
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
		
		// ���� ������ ����
		System.out.println("CarŬ���� ��ü�� �� : "+ Car.getNumOfCars());
		Car c1 = new Car();
		Car c2 = new Car(10,"RED","BMW");
		
		System.out.println("car Ŭ������ ��ü�� �� :" +Car.numOfCars);
		
		System.out.println(new Test().square(3));
	}// �ڹٴ� ��ü�� ���� �Ͻ� ���ؼ��� ���� ���� ������ ���ָ� ��� ����  
	// ��ü�� ���� ���� �ʿ� ���� �� ����ϴ� �� static
	
	public int square(int n){
		return n*n;
	}

}
