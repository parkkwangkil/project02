package programming03;

import exercise.MyAlgorithm;

public class Pair<T> {
	private T s1, s2;

	public Pair(T s1, T s2) {
		s1 = s1;
		s2 = s2;
	}

	public T getS1() {
		return s1;
	}

	public void setS1(T s1) {
		this.s1 = s1;
	}

	public T getS2() {
		return s2;
	}

	public void setS2(T s2) {
		this.s2 = s2;
	}

	public String toString() {
		return "s1" + "s2";
	}

}
