package programming05;

import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		double d, sum;
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("심사위원 점수");
			d = sc.nextDouble();
			list.add(d);
		}
		double max = Collections.max(list);
		double min = Collections.min(list);
		sum = 0.0;
		d = 0.0;
		for (int i = 0; i < 10; i++) {
			d = list.get(i);
			if (d != max && d != min)
				sum += d;
		}
		System.out.println(sum);
	}

}
