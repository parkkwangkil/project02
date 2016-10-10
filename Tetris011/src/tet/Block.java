package tet;

import java.util.Random;

import javax.swing.JFrame;

public class Block extends JFrame implements BlockInterface {
	private Tetrominoes pieceShape; // enum으로 선언된 테트리스 피스
	private int[][][] currentBlock = new int[4][4][2]; // 현재 클래스에서 사용할 테트리스 피스를
														// 받아온다.
	public int rotation = 0; // 피스의 회전값. 테트리스 피스의 속성에 따라 0-3의 값을 가진다.
	public int left = 0; // 피스를 왼쪽으로 이동한 값. 중첩된 값을 right값과 합산하여 현재 x좌표를 정한다.
	public int right = 0; // 피스를 오른쪽으로 이동한 값. 중첩된 값을 left값과 합산하여 현재 x좌표를 정한다.
	public int down = 0; // 피스가 아래로 떨어지는 값. Down키와 쓰레드 메소드 호출로 값이 변한다.
	private User user1 = new User();
	private int[][][] tetrominoes;
	private int x=10;
	private int y=22;

	public Block() {
		Random r = new Random();
		int x = Math.abs(r.nextInt()) % 6 + 1; // enum으로 선언된 테트리스 피스 중 하나를 무작위
												// 선택
		Tetrominoes[] values = Tetrominoes.values();
		setShape(values[x]);
	}

	public void setShape(Tetrominoes shape) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; ++j) {
				currentBlock[rotation][i][j] = shape.blocks[rotation][i][j];
			}
		}
	}

	public int[][][] getCurrentBlock() {
		return currentBlock;
	}

	@Override
	public void dropDown() {
		new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
						for (int i = 0; i < currentBlock.length; i++) {
							currentBlock[rotation][i][1] += 1;
							down = currentBlock[rotation][i][1];
						}
						// repaint();
					} catch (InterruptedException e) {
					}
				}
			}

		}.start();

	}

	@Override
	public void setMoveDirection(UserInterface directionInput) {
		if (user1.leftInput == 37) {
			left++;
		} else if (user1.rightInput == 39) {
			right++;
		}
	}

	@Override
	public void setRotation(UserInterface rotationInput) {
		if (rotation == 3) {
			rotation = 0;
		} else {
			rotation++;
		}
	}

	@Override
	public int[][] getBlock() {
		int[][] xy = tetrominoes[0];	// 임의의 테트로노미스 블록 리턴
		if(x > 0|y > 0)	// 조건 수정해야함
			return xy;
		else
			return null;
	}
	
}
