package programming02;

public class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

class MyExceptionTest {
	public static void checkNegative(int number) throws MyException {
		if (number < 0) {
			throw (new MyException("음수는 안된다."));
		}
		System.out.println("다행히 음수가 아니군요");
	}

	public static void main(String[] args) {
		try {
			checkNegative(1);
			checkNegative(-1);

		} catch (MyException ex) {
			ex.printStackTrace();
		}
	}
}