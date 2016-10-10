package tet;

public interface BlockInterface {
	public void dropDown();	// UML상 5번 시나리오. 블록의 현재 위치의 y값을 바꿔서 스스로 떨어짐.
	public void setMoveDirection(UserInterface directionInput);	// UML상 2번 시나리오. User클래스로부터 방향 입력을 받아온다.
	public void setRotation(UserInterface rotationInput);	// UML상 4번 시나리오. User클래스로부터 회전 입력을 받아온다.
	public int[][] getBlock();	// UML상 6번 시나리오. Board클래스에 블록 정보를 보낸다. 

}
