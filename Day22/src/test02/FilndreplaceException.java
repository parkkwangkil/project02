package test02;

public class FilndreplaceException {

	public static void main(String[] args) {
		String str = "��� ���α׷��� �ڹ�  ���� ���� �� �� �ִ�";
		int index = str.indexOf(str);
		if (index == -1) {
			System.out.println("�ڹ� ���ڿ��� ���� �Ǿ� ���� �ʴ�.");

		} else {
			System.out.println("�ڹ� ���ڿ��� ���� �Ǿ� �ִ�");
			str = str.replace("�ڹ�", "java");
			System.out.println("->" + str);
		}

	}

}
