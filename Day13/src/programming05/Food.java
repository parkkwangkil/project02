package programming05;

public class Food {
	int cal;
	int pay;
	int weight;

	public Food(int cal, int pay, int weight) {
		this.cal = cal;
		this.pay = pay;
		this.weight = weight;
		// this.farm = farm;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString() {
		return "칼로리" + cal + "가격" + pay + "무게" + weight;
	}

}
