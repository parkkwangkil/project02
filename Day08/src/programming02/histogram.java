package programming02;

import java.util.Scanner;

class Histomgram {
	int[] range;
	int size;

	public Histomgram(int size) {
		this.size = size;
		range = new int[size];
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print((i * 10 + 1) + " - " + ((i + 1) * 10 + ": "));
			for (int j = 0; j < range[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력 하시오 : ");
		int k = s.nextInt();
		if (k != 0) {
			range[(k - 1) / 10]++;
		} else
			range[0]++;
	}
}