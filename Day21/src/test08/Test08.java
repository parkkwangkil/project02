package test08;

public class Test08 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int i = 0;
		try {
			for (i = 0; i < array[i]; i++)
				System.out.println(array[i] + " ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("꺼져" + i + "사용불가");
		}

	}

}
