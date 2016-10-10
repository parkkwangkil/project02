package tet;

public interface BlockInterface {
	public void dropDown();	// UML�� 5�� �ó�����. ����� ���� ��ġ�� y���� �ٲ㼭 ������ ������.
	public void setMoveDirection(UserInterface directionInput);	// UML�� 2�� �ó�����. UserŬ�����κ��� ���� �Է��� �޾ƿ´�.
	public void setRotation(UserInterface rotationInput);	// UML�� 4�� �ó�����. UserŬ�����κ��� ȸ�� �Է��� �޾ƿ´�.
	public int[][] getBlock();	// UML�� 6�� �ó�����. BoardŬ������ ��� ������ ������. 

}
