package Lab;

public class BoxTest {

//5
	public static void main(String[] args) {
//6		
		Box box1 = new Box();
//9		
		Box box2 = new Box();
//7	
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
//8
		System.out.println(box1.getVolume());
//10		
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
	
		//System.out.println(box2.getVolume());	
		
		System.out.println(box1.getVolume());	
	}

}
// 11 
// box1 100000�� ���
// box2 800000�� �����µ� 
// box2�� ��� �κп� box1�� ����϶�� ��Ű��  
// box 1 ���� ��� �ǰ� ������ �մ� box 1 ���� ���� 