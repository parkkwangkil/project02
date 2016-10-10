
public class Test02 {

	public static void main(String[] args) {
		String s = new String ("HELLO, evryone!");
		String r1 = s.substring(3); // 문자열 잘라내기 
		String r2 = s.substring(3, 7);
		String r3 = s.toUpperCase(); // 대문잘호 
		String r4 = s.toLowerCase(); // 소문자로
		String r5 = s.replace('H', 'X'); // 이름 바꿔라
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);

	}

}
