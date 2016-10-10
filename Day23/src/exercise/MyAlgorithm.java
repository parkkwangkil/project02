package exercise;

public final class MyAlgorithm {
	public static <T> void swap(T[] a, int i, int j){
	 	T t = a[i];
	 	a[i] = a[j];
	 	a[j] = t;
	}
}
