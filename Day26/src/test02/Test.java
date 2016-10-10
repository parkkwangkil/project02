package test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("samoyed.jpg");
			out = new FileOutputStream("spitz.jpg");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);

			}
			System.out.println("����Ϸ�");
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // ���� ó�� �ߵ� ���ߵ� ������ ����
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}