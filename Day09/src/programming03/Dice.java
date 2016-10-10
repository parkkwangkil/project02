package programming03;

public class Dice {
	private int dg;

	 void roll() {
		dg = (int) (Math.random() * 6) + 1;
	}

	public int getDice() {
		return dg;
	}
	

}
