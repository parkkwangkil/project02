
public class Test02 {

	public static void main(String[] args) {
		String s = new String ("HELLO, evryone!");
		String r1 = s.substring(3); // ���ڿ� �߶󳻱� 
		String r2 = s.substring(3, 7);
		String r3 = s.toUpperCase(); // �빮��ȣ 
		String r4 = s.toLowerCase(); // �ҹ��ڷ�
		String r5 = s.replace('H', 'X'); // �̸� �ٲ��
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);

	}

}
