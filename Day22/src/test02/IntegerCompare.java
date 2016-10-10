package test02;

public class IntegerCompare {

	public static void main(String[] args) {
		Integer obj1 =100;
		Integer obj2 =100;
		Integer obj3 =300;
		Integer obj4 =300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);

	}

}
// -127 ~ 128은 == 비교  나머지는 번지 값 비교 