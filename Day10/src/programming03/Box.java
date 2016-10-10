package programming03;

public class Box {
	private int length;
	private int height;
	private int weight;
	private boolean empty = false;

// set 선언
	
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
// set 선언 종료

// get 선언 시작 

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

// get 선언문 종료 


public Box(){
	this(0, 0, 0);
}

public Box(int length, int height, int weight) {
	this.length = length ;
	this.height = height ;
	this.weight = weight ;
//	empty = empty ;
	
	
}
// toString 시작 
public String toString(){
	return "길이" + length + "너비" + height +"높이" +weight + "빈값" +empty;
	
// to String 종료	
}
}