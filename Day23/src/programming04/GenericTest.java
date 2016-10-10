package programming04;

public class GenericTest {

	public static void main(String[] args) {
		int x = 0;
		float y = 0.0f;
		Test.<Object> GenericArray(x);
		Test.<Object> GenericArray(y);

	}

}
