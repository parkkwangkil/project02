package test04;

public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		
		box.setData("hello");
		String result = box.getData();
		System.out.println(result);

//////////////////////////////////////////////////		
//      String 버전으로 만들어진 박스에 int르 넣거나 빼면 안된다.		
//		box.setData(100);
//		int result2 = box.getData();
//		System.out.println(result2);
/////////////////////////////////////////////////		
		Box<Integer> box2 = new Box<Integer>();
		box2.setData(100);
		int result3 = box2.getData();
		System.out.println(result3);
		
		

	}

}
