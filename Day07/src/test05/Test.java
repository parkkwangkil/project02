package test05;

public class Test {

	public static void main(String[] args) {
		String s1 = new String ("APPLE");
		String s2 = new String ("APPLE");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "APPLE";
		String s4 = "APPLE";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		

	}

}
