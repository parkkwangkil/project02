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
// box1 100000이 출력
// box2 800000이 나오는데 
// box2의 출력 부분에 box1을 출력하라고 시키면  
// box 1 값이 출력 되고 기존에 잇던 box 1 값을 삭제 