package test03;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2; // Car �� ���� �ڷ��� 
		
		c2 = c1; // ����� c1�� �ּҸ� �޴´�.
		
		c1.speed = 100;
		c1.model = "�ƿ��";
		System.out.println(c2.toString()); //c2�� . ������ ���� ��ü 
		
		c1 = null; // �ּ� (������) ���� ���ٸ� ������ �÷��Ͱ� ���� �Ѵ�.
		c2 = null;
				

	}

}
