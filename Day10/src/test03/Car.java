package test03;

	public class Car {
		private int speed;
		private String color;
		private String model;
		// Ŭ���� �ۼ��� �����ڸ� �ۼ� ���ϸ� �Ʒ��� ��� �ִ� �����ڰ� ������ �� �ڵ�����
		// ����.
		
		static int numOfCars=0;
		
		public static int getNumOfCars(){
			return numOfCars;
		}
/* public Car(){}*/
		
		public Car(){
			this(0,"silver","bentz");
		}
		
//		public Car() {
//			System.out.println("�Ű� ���� ���� ������ ȣ�� ");
//			speed = 0;
//			color = "ȭ��Ʈ";
//			model = "����";
//		}

		public Car(int s, String c, String m) {
			System.out.println("int ,String , String ������ ���� ");
			speed = s;
			color = c;
			model = m;
			numOfCars++;
		} // �� ������ ���⼭ ���� �ް� ��� �Ѵ�.

		public void speedUp() {
			speed += 10;
		}

		public void speedDown() {
			speed -= 10;
		}

		public String toString() {
			return "�� :" + model + "����" + color + "�ӵ�" + speed;
		}

	}

