package lab;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list;
		int sum = 0;
		int count;
	
		System.out.println("������ ����:");
		count = sc.nextInt();
		list = new int[count];
		try{
		for(int i=0; i<count; i++){
			System.out.println("���� �Է�");
			list[i]= sc.nextInt();
			
		}
		for(int i=0; i<count; i++){
			sum += list[i];
			
		}
		System.out.println("�����"+sum/count);
		}catch (ArithmeticException e){
		System.out.println("sum/count");
		}catch (NegativeArraySizeException e) {
			System.out.println("list = new int[3]");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("list�� �� �Է� ");
		}catch (NullPointerException e) {
			System.out.println("null ���� �ٽ� �Է�");
			
		}
		

	}

}
