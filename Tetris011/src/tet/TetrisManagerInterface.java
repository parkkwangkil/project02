package tet;

public interface TetrisManagerInterface {
	public void setFullBlockArray(BoardInterface setFullBlock);	// 9�� �ó�����.  Board�κ��� �޾ƿ� ���� ���� Board ���¸� �ٲٱ� ���� ������ �Ѵ�.
	public TetrisManagerInterface getArrayLineErase();	// 10�� �ó�����. Board ���¸� �ٲٱ� ���� ������ ���� ��ȯ�Ͽ� Board�� ������.
	public void setVerticalLimitOver(BoardInterface setVerticalLimit);	// 12�� �ó�����. Board�κ��� �޾ƿ� ���� ���� Board ���¸� �ٲٱ� ���� ������ �Ѵ�.
	public TetrisManagerInterface getGameOver();	// 13�� �ó�����. User���� GameOver�� �Ǿ����� �˸��� ���� ��ȯ�Ѵ�.

}
