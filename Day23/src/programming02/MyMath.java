package programming02;

public class MyMath<T extends Number> {
	double d = 0.0;

	public double getAverage(T[] average) {
		for (int i = 0; i < average.length; i++) {
			d = d + average[i].doubleValue();

		}
		return d / average.length;

	}

}
