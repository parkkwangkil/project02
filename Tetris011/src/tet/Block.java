package tet;

import java.util.Random;

import javax.swing.JFrame;

public class Block extends JFrame implements BlockInterface {
	private Tetrominoes pieceShape; // enum���� ����� ��Ʈ���� �ǽ�
	private int[][][] currentBlock = new int[4][4][2]; // ���� Ŭ�������� ����� ��Ʈ���� �ǽ���
														// �޾ƿ´�.
	public int rotation = 0; // �ǽ��� ȸ����. ��Ʈ���� �ǽ��� �Ӽ��� ���� 0-3�� ���� ������.
	public int left = 0; // �ǽ��� �������� �̵��� ��. ��ø�� ���� right���� �ջ��Ͽ� ���� x��ǥ�� ���Ѵ�.
	public int right = 0; // �ǽ��� ���������� �̵��� ��. ��ø�� ���� left���� �ջ��Ͽ� ���� x��ǥ�� ���Ѵ�.
	public int down = 0; // �ǽ��� �Ʒ��� �������� ��. DownŰ�� ������ �޼ҵ� ȣ��� ���� ���Ѵ�.
	private User user1 = new User();
	private int[][][] tetrominoes;
	private int x=10;
	private int y=22;

	public Block() {
		Random r = new Random();
		int x = Math.abs(r.nextInt()) % 6 + 1; // enum���� ����� ��Ʈ���� �ǽ� �� �ϳ��� ������
												// ����
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
		int[][] xy = tetrominoes[0];	// ������ ��Ʈ�γ�̽� ��� ����
		if(x > 0|y > 0)	// ���� �����ؾ���
			return xy;
		else
			return null;
	}
	
}
