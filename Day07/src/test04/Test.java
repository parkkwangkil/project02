package test04;

public class Test {

	public static void main(String[] args) {
		int i = 10;
		
		System.out.println(i+10); // ������ 10+10 = 20
		String s = i+""; // �ƹ�  ���� ���� ���ڿ� �̾� ���̱⸦ �ϸ� ������ ���ڿ��� �ȴ�.
		
		System.out.println(s+10); // ���ڿ��̶� 1010 ��
		
	////
		String s2 ="123";
		System.out.println(s2+10); 
		
		int i2 = Integer.parseInt(s2); // ���ڿ��� ������ ���� ���� i�� ���� 123�� ����
		double d = Double.parseDouble(s2); // double�� ���� ���ش�.
		
		System.out.println(i2+10);
		System.out.println(d+10); // ��� ���� ���� 
		
	}

}
