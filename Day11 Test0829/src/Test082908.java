
public class Test082908 {

	public static void main(String[] args) {
		System.out.println("구구단 시작");

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.println(i + "*" + j + "=" + i * j);
			System.out.println("구구단 종료");
		}

	}
}