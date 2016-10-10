package game;

import java.util.Random;

public class Die {
	int value;
	int die;

	public Die() {
		die = 1;

	}

	public int roll() {
		Random random = new Random();
		die = (random.nextInt(6)) + 1;
		return die;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		return "" + die + "";

	}

}
