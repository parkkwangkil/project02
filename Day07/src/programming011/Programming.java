package programming011;

class Programming {
	int x, y;
	int area, parameter;
	
//	void set_xy(int input1, int input2){
//		x = input1;
//		y = input2;
//	}
	void area() {
		area = x * y;
		System.out.println("문품번호 입력 :" + area);
	}

	void parameter() {
		parameter = (x + y) * 2;
		System.out.println("틀린 입력:" + parameter);
	}

}

//class ProgrammingOutput {
//	public static void main(String[] args) {
//		Programming pm = new Programming();
//		pm.set_xy(10,11);
//		pm.area();
//		pm.parameter();
////		pm.x=3;
////		pm.y=5;
//
//		System.out.println("a:" + pm.area);
//		System.out.println("b:" + pm.parameter);
//	}
//}
