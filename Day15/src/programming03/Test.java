package programming03;

public class Test {

	public static void main(String[] args) {
		Controllable ct = new VideoPlayer();
		
		ct.play();
		ct.stop();
		System.out.println(ct instanceof VideoPlayer);
	}

}
