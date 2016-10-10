package test03;

public class Car {
		
		int speed;
		String model;

		void speedUp(int s) { //() 안에 있는 것을 매개변수라고 한다.
			speed += s;
		}

		void speedDown(int x) {
			speed -= x;
		}

		public String toString() {
			return "속도:" + speed + ", 모델:" + model;
		}

	}
