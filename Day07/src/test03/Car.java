package test03;

public class Car {
		
		int speed;
		String model;

		void speedUp(int s) { //() �ȿ� �ִ� ���� �Ű�������� �Ѵ�.
			speed += s;
		}

		void speedDown(int x) {
			speed -= x;
		}

		public String toString() {
			return "�ӵ�:" + speed + ", ��:" + model;
		}

	}
