package tet;

public interface BoardInterface {
	public void lineDown();	// UML상 11번 시나리오. 
	public void setBlockPosition(BlockInterface blockPosition);	//UML 6번 시나리오.
	public void setBlockStack(BlockInterface blockPosition);	// UML 8번 시나리오. 블록이 최하단부 혹은 이미 착지한 블록에 닿았을 때 해당 Block을 Board 배경의 속성을 가진 상태로 만든다.
	public BoardInterface getFullBlock();	// 9번 시나리오. 각 블록조각이 수평으로 다 채워진 상태를 반환한다.
	public void setBreakBlock(TetrisManagerInterface tm);	// 10번 시나리오. 수평으로 다 채워진 블록들을 삭제한다.
	public BoardInterface getVerticalLimitOver();	// 12번 시나리오. 수직으로 블록이 전부 채워졌을 때의 상태를 반환한다.

}
