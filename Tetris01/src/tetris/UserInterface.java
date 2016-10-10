package tetris;

public interface UserInterface {

	UserInterface getKeyPressed();

	void setBlock(BoardInterface currentBlock);

	void showGameOver(TetrisManagerInterface tm);

}
