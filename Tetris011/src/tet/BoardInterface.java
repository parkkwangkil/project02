package tet;

public interface BoardInterface {
	public void lineDown();	// UML�� 11�� �ó�����. 
	public void setBlockPosition(BlockInterface blockPosition);	//UML 6�� �ó�����.
	public void setBlockStack(BlockInterface blockPosition);	// UML 8�� �ó�����. ����� ���ϴܺ� Ȥ�� �̹� ������ ��Ͽ� ����� �� �ش� Block�� Board ����� �Ӽ��� ���� ���·� �����.
	public BoardInterface getFullBlock();	// 9�� �ó�����. �� ��������� �������� �� ä���� ���¸� ��ȯ�Ѵ�.
	public void setBreakBlock(TetrisManagerInterface tm);	// 10�� �ó�����. �������� �� ä���� ��ϵ��� �����Ѵ�.
	public BoardInterface getVerticalLimitOver();	// 12�� �ó�����. �������� ����� ���� ä������ ���� ���¸� ��ȯ�Ѵ�.

}
