package test06;

public class Test06 {

	public static void main(String[] args) {
	//	int[] numbers;
	//	numbers = new int[5];
		
	// int[] numbers;
	//	numbers ={10,20,30,40,50};
		
		int[] numbers = {10,20,30,40,50};
		for (int i=0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}
		// ���ο� ������ for��(foreach ��� �θ�)
		for (int n:numbers){
			System.out.println(n);
			
		}
	}

}
