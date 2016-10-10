package test02;

public class Car {
	private int speed = 0;
	private String color = "silver";
	private String model = "benz";

	public void speedUp() {
		// speed +=10;
		if (speed < 300)
			speed += 10;
	}

	public void speedDown() {
		if (speed >= 100)
			speed -= 10;
	}

	public String toString() {
		return "����" + color + "��" + model + "�ӵ�" + speed;
	}

	////////////////////////////////////////////////////////
	public void setColor(String c) { // ���� ��� �־��ش�.
		color = c; // setter �������ִ� �����
	}

	public String getColor() {
		return color; // getter ������ ��� ���� �R�����ִ� ��

	}

	public void setSpeed(int s) {
		if(s <300 && s>=0)
		 speed = s;
	}

	public int getSpeed() {
		return speed;

	}


	public void setModel(String m) {
		model = m;
	}

	public String getModel() {
		return model;
	}
}