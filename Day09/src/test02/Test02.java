package test02;

public class Test02 {

	public static void main(String[] args) {
		Car c = new Car();
	//	c.speed = 100; //private�� ���� �Ǿ� ���Ұ�
		c.speedDown();
		c.speedUp();
		c.speedUp();
		System.out.println(c.toString());
		
		//c.color ="����";
		c.setColor("����õ�");
		//System.out.println("����� ����" +c.color);
		System.out.println("�� ������ 6s�� ���� :"+" "+c.getColor());

		

	}

}
