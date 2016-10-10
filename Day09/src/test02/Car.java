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
		return "색상" + color + "모델" + model + "속도" + speed;
	}

	////////////////////////////////////////////////////////
	public void setColor(String c) { // 값을 대신 넣어준다.
		color = c; // setter 설정해주는 담당자
	}

	public String getColor() {
		return color; // getter 접근자 결과 값을 홗인해주는 것

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