package programming01;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
	ArrayList<T> list = new ArrayList<T>();
	private Random r = new Random();

	public void add(T item) {
		this.list.add(item);
	}

	public T select() {
		int index = this.r.nextInt(this.list.size());
		return this.list.get(index);
	}

	public static void main(String[] args) {
		RandomList<String> rl = new RandomList<String>();
		RandomList<Integer> ri = new RandomList<Integer>();
		RandomList<Double> rd = new RandomList<Double>();
		rl.add("1");
		rl.add("2");
		ri.add(3);
		ri.add(4);
		ri.add(5);
		rd.add(6.6);
		rd.add(7.7);
		rd.add(8.8);
		System.out.println(rl.select());
		System.out.println(ri.select());
		System.out.println(rd.select());


	}

}
