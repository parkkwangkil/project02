package test03;

public class Test {

	public static void main(String[] args) {
		 Box box = new Box();
	        //////////////////////////////////////////////////////////
	        // box�� int ���� �뵵�� ���
	        box.setData(10);
	        int result = (int)box.getData();
	        System.out.println("�ڽ��� ���� ������:"+result);
	         
	        //////////////////////////////////////////////////////////
	        // box�� String ���� �뵵�� ���
	        box.setData("Hello");
	        String result2 = (String)box.getData();
	        System.out.println("�ڽ��� ���� ������:"+result2);
	         
	        //////////////////////////////////////////////////////////
	        // box�� �߸� Ȱ���ϴ� ���̽�
	        box.setData(100);
	        box.setData("Java");
	        int result3 = (int)box.getData();
	        System.out.println("�ڽ��� ���� ������:"+result3);
	    }
	}