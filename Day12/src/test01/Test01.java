package test01;

public class Test01 {

	public static void main(String[] args) {
		int[] a ={45,48,8,8,2,21,68,4,23,6,84,31};
	//	countEven(a);
		
//		for(int n:a){
//	System.out.println(n+"");
//		}
//		System.out.println();
//		
//		countEven(a);
//		
//		for(int n:a){
//			System.out.println(n+"");
//		}
		System.out.println("a ¹è¿­ÀÇ Â¦¼ö °¹¼ö" +countEven(a));

	}
	
	public static int countEven(int[] list){
//		 list[5]=99;
		
		int count =0;
		for(int n: list){
			if(n%2==0)
				count++;
		}
		return count;
	}

}
