package test02;

public class PatternMathcer {

	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp="[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = PatternMathcer(regExp, id);
		if(isMatch){
			System.out.println("id ��밡��");
		}else{
			System.out.println("���Ұ�");
		}

	}

	private static boolean PatternMathcer(String regExp, String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
