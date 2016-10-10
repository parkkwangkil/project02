package test03;

public class Test {

	public static void main(String[] args) {
		 Box box = new Box();
	        //////////////////////////////////////////////////////////
	        // box를 int 저장 용도로 사용
	        box.setData(10);
	        int result = (int)box.getData();
	        System.out.println("박스에 담은 데이터:"+result);
	         
	        //////////////////////////////////////////////////////////
	        // box를 String 저장 용도로 사용
	        box.setData("Hello");
	        String result2 = (String)box.getData();
	        System.out.println("박스에 담은 데이터:"+result2);
	         
	        //////////////////////////////////////////////////////////
	        // box를 잘못 활용하는 케이스
	        box.setData(100);
	        box.setData("Java");
	        int result3 = (int)box.getData();
	        System.out.println("박스에 담은 데이터:"+result3);
	    }
	}