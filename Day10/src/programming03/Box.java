package programming03;

public class Box {
	private int length;
	private int height;
	private int weight;
	private boolean empty = false;

// set ����
	
public void setLength(int length){
	length = length;
}
public void setHeight(int height){
	height = height;
}
public void setWeight(int weight){
	weight = weight;
}
public void setEmpty(boolean empty){
	empty = empty;
}
// set ���� ����

// get ���� ���� 

public int getLength(){
	return length;
}

public int getHeight(){
	return height;
}

public int getWeight(){
	return weight;
}

public boolean getEmpty(){
	return empty;
}

// get ���� ���� 


public Box(){
	this(0, 0, 0);
}

public Box(int length, int height, int weight) {
	this.length = length ;
	this.height = height ;
	this.weight = weight ;
//	empty = empty ;
	
	
}
// toString ���� 
public String toString(){
	return "����" + length + "�ʺ�" + height +"����" +weight + "��" +empty;
	
// to String ����	
}
}