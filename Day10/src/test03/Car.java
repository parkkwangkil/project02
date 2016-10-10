package test03;

	public class Car {
		private int speed;
		private String color;
		private String model;
		// 클래스 작성시 생성자를 작성 안하면 아래에 비어 있는 생성자가 컴파일 시 자동으로
		// 들어간다.
		
		static int numOfCars=0;
		
		public static int getNumOfCars(){
			return numOfCars;
		}
/* public Car(){}*/
		
		public Car(){
			this(0,"silver","bentz");
		}
		
//		public Car() {
//			System.out.println("매개 변수 없는 생성자 호출 ");
//			speed = 0;
//			color = "화이트";
//			model = "벤츠";
//		}

		public Car(int s, String c, String m) {
			System.out.println("int ,String , String 생성자 ㅎ출 ");
			speed = s;
			color = c;
			model = m;
			numOfCars++;
		} // 값 들어오면 여기서 값을 받고 출력 한다.

		public void speedUp() {
			speed += 10;
		}

		public void speedDown() {
			speed -= 10;
		}

		public String toString() {
			return "모델 :" + model + "색상" + color + "속도" + speed;
		}

	}

