package Lab;

public class Box {
// 1
	private int width; // 너비
	private int length; // 길이
	private int height; // 높이

	void setWidth(int w) {
		width = w;
	}
	void setLength(int l){
		length = l;
	}
	void setHeight(int h){
	height = h;
	}
//2

	public int getWidth(int w) {
		return width;
	}

	public int getLength(int l) {
		return length;
	}

	public int getHeight(int h) {
		return height;
	}
// 3
	public int getVolume() {
		return width * length * height;
	}
// 4
	public String toSting() {
		return "박스의 무게는" + "너비" + width + "길이" + length + "높이" + height;
	}
	
	public void print(){
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
		
	}
}
