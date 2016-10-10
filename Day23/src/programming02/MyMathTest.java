package programming02;

public class MyMathTest {

	public static void main(String[] args) {
		Integer[] ilist ={1,2,3,4,5};
		Double[] dlist ={1.1,2.2,3.3,4.4,5.5};
		MyMath<Integer> i = new MyMath<Integer>();
		System.out.println(i.getAverage(ilist));
		MyMath<Double> d = new MyMath<Double>();
		System.out.println(d.getAverage(dlist));
		

	}

}
