package tetris;

import java.util.Random;

public class BoxsShape {

	/**
	 * ����� ���¿� ���� �̸��� ������ ������
	 */
	enum TetrisBlocks {
		NoShape, ZShape, SShape, LineShape, TShape, SquareShape, LShape, MirroredLShape
	}

	/**
	 * ���� �� ��ü�� ������ �ִ� ��Ʈ���� ����� ����
	 */
	private TetrisBlocks nowShape;

	/**
	 * ���� �� ��ü�� ������ �ִ� ��Ʈ���� ����� �����ϴ� ����� ��ǥ�� [��� �ε���][��ǥ]
	 */
	private int coords[][];

	/**
	 * �� ��ü�� ������ �ִ� ��Ʈ���� ����� �����ϴ� ����� ��ǥ���� ��ü ���� [���� �ε���][��� �ε���][��ǥ]
	 */
	private int coordsTable[][][];

	public BoxsShape() {
		coords = new int[4][2];
		setShape(TetrisBlocks.NoShape);
	}

	/**
	 * ���� �� ��ü�� ������ �ִ� ��Ʈ���� ����� ���׸� �Է� ���� ���·� �����Ѵ�.
	 * 
	 * @param TetrisBlocks
	 */
	public void setShape(TetrisBlocks shape) {

		coordsTable = new int[][][] {
				{ { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 } }, //NoShape
				{ { 0, -1 }, { 0, 0 }, { -1, 0 }, { -1, 1 } },//SquareShape
				{ { 0, -1 }, { 0, 0 }, { 1, 0 }, { 1, 1 } },//LShape
				{ { 0, -1 }, { 0, 0 }, { 0, 1 }, { 0, 2 } },//Line
				{ { -1, 0 }, { 0, 0 }, { 1, 0 }, { 0, 1 } },
				{ { 0, 0 }, { 1, 0 }, { 0, 1 }, { 1, 1 } },
				{ { -1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 } },
				{ { 1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 } } };
//				{ { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 } }, // NoShape
//				{ { 0, -1 }, { 0, 0 }, { -1, 0 }, { -1, 1 } },// ZShape
//				{ { 0, -1 }, { 0, 0 }, { 1, 0 }, { 1, 1 } },// ZShape
//				{ { 0, -1 }, { 0, 0 }, { 0, 1 }, { 0, 2 } },// Line
//				{ { -1, 0 }, { 0, 0 }, { 1, 0 }, { 0, 1 } },// TShape
//				{ { 0, 0 }, { 1, 0 }, { 0, 1 }, { 1, 1 } },// SquareShape
//				{ { -1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 } },// LShape
//				{ { 1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 } } }; // MirroredLShape

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; ++j) {
				coords[i][j] = coordsTable[shape.ordinal()][i][j];
			}
		}
		nowShape = shape;
	}

	/**
	 * ���� �� ��ü�� ������ �ִ� ��Ʈ���� ��Ͽ� ���� ���¸� �������� �����Ѵ�.
	 */
	public void setRandomShape() {
		Random r = new Random();
		int x = Math.abs(r.nextInt()) % 7 + 1;
		TetrisBlocks[] values = TetrisBlocks.values();
		setShape(values[x]);
	}

	/**
	 * ���� �� ��ü�� ������ �ִ� ��Ʈ���� ����� ��ġ ���迡 ���� i ��° ����� X ��ǥ�� �����´�.
	 * 
	 * @param i
	 * @return X ��ǥ
	 */
	public int getX(int i) {
		return coords[i][0];
	}

	/**
	 * ���� �� ��ü�� ������ �ִ� ��Ʈ���� ����� ��ġ ���迡 ���� i ��° ����� Y ��ǥ�� �����´�.
	 * 
	 * @param i
	 * @return Y ��ǥ
	 */
	public int getY(int i) {
		return coords[i][1];
	}

	/**
	 * ���� �� ��ü�� ������ �ִ� ��Ʈ���� ����� ���¸� ��ȯ�Ѵ�.
	 * 
	 * @return TetrisBlocks�� ������
	 */
	public TetrisBlocks getShape() {
		return nowShape;
	}

	/**
	 * ����� �̷�� ���� ����� X ��ǥ�� �����Ѵ�. i�� ���� ���� ����� ������ �����ϴ�.
	 * @param i
	 * @param x
	 */
	private void setX(int i, int x) {
		coords[i][0] = x;
	}

	/**
	 * ����� �̷�� ���� ����� Y ��ǥ�� �����Ѵ�. i�� ���� ���� ����� ������ �����ϴ�.
	 * @param i
	 * @param Y
	 */
	private void setY(int i, int y) {
		coords[i][1] = y;
	}
	
	/**
	 * ����� ������ �ִ� ���� ���� X ��ǥ
	 * @return X ��ǥ 
	 */
	public int minX() {
		int m = coords[0][0];//ù ��° X ��ǥ
		for (int i = 0; i < 4; i++) {
			m = Math.min(m, coords[i][0]); // ������ X ��ǥ�� ���Ѵ�.
		}
		return m;
	}

	/**
	 * ����� ������ �ִ� ���� ���� Y ��ǥ
	 * @return Y ��ǥ
	 */
	public int minY() {
		int m = coords[0][1];
		for (int i = 0; i < 4; i++) {
			m = Math.min(m, coords[i][1]);
		}
		return m;
	}

	/**
	 * ���õǾ� �ִ� ����� ��ǥ�� ���������� ������ ��ȯ�Ѵ�.
	 * @return BoxsShape
	 */
	public BoxsShape rotateRight() {
		if (nowShape == TetrisBlocks.SquareShape)
			return this;

		BoxsShape result = new BoxsShape();
		result.nowShape = nowShape;

		for (int i = 0; i < 4; ++i) {
			result.setX(i, getY(i));
			result.setY(i, -getX(i));
		}
		return result;
	}

	/**
	 * ���õǾ� �ִ� ����� ��ǥ�� �������� ������ ��ȯ�Ѵ�.
	 * @return BoxsShape
	 */
	public BoxsShape rotateLeft() {
		if (nowShape == TetrisBlocks.SquareShape)
			return this;

		BoxsShape result = new BoxsShape();
		result.nowShape = nowShape;

		for (int i = 0; i < 4; ++i) {
			result.setX(i, -getY(i));
			result.setY(i, getX(i));
		}
		return result;
	}
}
