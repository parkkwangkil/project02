package Lab;

public class Box {
// 1
	private int width; // �ʺ�
	private int length; // ����
	private int height; // ����

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
		return "�ڽ��� ���Դ�" + "�ʺ�" + width + "����" + length + "����" + height;
	}
	
	public void print(){
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
		
	}
}
