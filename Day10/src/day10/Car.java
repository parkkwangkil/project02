package day10;

public class Car {
	private int speed;
	private String color;
	private String model;
	// Ŭ���� �ۼ��� �����ڸ� �ۼ� ���ϸ� �Ʒ��� ��� �ִ� �����ڰ� ������ �� �ڵ����� 
	// ����.

	public  Car() {
		System.out.println("�Ű� ���� ���� ������ ȣ�� ");
		speed = 0;
		color = "ȭ��Ʈ";
		model = "����";
	}

	public  Car(int s, String c, String m) {
		System.out.println("int ,String , String ������ ���� ");
		speed = s;
		color = c;
		model = m;
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


