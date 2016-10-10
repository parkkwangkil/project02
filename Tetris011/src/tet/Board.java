package tet;

import javax.swing.JFrame;
import javax.swing.Timer;


public class Board extends  JFrame implements BlockInterface, TetrisManagerInterface{
	private static final int Y_COORDINATE_INDEX = 1;
	private static final int X_COORDINATE_INDEX = 0;
	private static final int BOARD_SPATIAL_DIMENSION = 2;
	private static final int TOTAL_NUMBER_OF_BLOCK_COODINATES = 4;
	public static final int boardWidth = 10;
	public static final int boardHeight = 22;
	private Tetrominoes[][] tetriminoes = new Tetrominoes[boardHeight][boardWidth]; 
	
	public Board(){
		setFocusable(true); // 이 객체가 구현하는 창이 포커스를 가진다.
		pieceShape = new Block();
		timer = new Timer(400, this); // actionPerformed를 400 ms 마다 실행 설정
		board = new Block[boardwidth * boardheight];
		 addKeyListener(new TetrisKeyListener()); // 키를 등록 
		 clearBoard(); // 보드 초기화
	}
		/* 보드 초기화 */
		this.initBoard(boardHeight, boardWidth);
	}
	
	private void initBoard(int height, int width) {
		for (int row = 0 ; row < height ; row++) {
			for (int col = 0 ; col < width ; col++) {
				this.setTetrimino(row, col, Tetrominoes.NoShape);
			}
		}	
	}

	private void setTetrimino(int row, int col, String noshape) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFullBlockArray(BoardInterface setFullBlock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TetrisManagerInterface getArrayLineErase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVerticalLimitOver(BoardInterface setVerticalLimit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TetrisManagerInterface getGameOver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dropDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMoveDirection(UserInterface directionInput) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRotation(UserInterface rotationInput) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[][] getBlock() {
		// TODO Auto-generated method stub
		return null;
	}

}
