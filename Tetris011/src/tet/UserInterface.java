package tet;

public interface UserInterface {
	public UserInterface getKeyPressed();	// UML�� 2�� �ó�����. BlockŬ������ �Է��� key���� ������. keyPressed(KeyEvent e)�̿��� �� 
	public void setBlock(BoardInterface currentBlock);	// UML�� 1��, 7�� �ó�����. Board Ŭ�����κ��� ��ϰ��� �޾ƿ´�.
	public void showGameOver(TetrisManagerInterface tm);	// UML�� 13�� �ó�����. �� �޼ҵ尡 ȣ��Ǹ� '�ش� ����'�� ��Ʈ������ ����ȴ�.
	

}
