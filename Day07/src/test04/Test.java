package test04;

public class Test {

	public static void main(String[] args) {
		int i = 10;
		
		System.out.println(i+10); // 정수라 10+10 = 20
		String s = i+""; // 아무  값도 없는 문자에 이어 붙이기를 하면 정수가 문자열이 된다.
		
		System.out.println(s+10); // 문자열이라 1010 됨
		
	////
		String s2 ="123";
		System.out.println(s2+10); 
		
		int i2 = Integer.parseInt(s2); // 문자열을 정수로 변경 변수 i에 정수 123이 저장
		double d = Double.parseDouble(s2); // double로 변경 해준다.
		
		System.out.println(i2+10);
		System.out.println(d+10); // 산술 연산 가능 
		
	}

}
