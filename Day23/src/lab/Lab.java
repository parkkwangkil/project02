package lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab {
	public static void main(String[] args) {
		Map<String, String> st = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		int select = 0;
		st.put("Map", "����");
		st.put("java", "�ڹ�");
		st.put("school", "�б�");
		do {
			if (select == 0) {
				System.out.println("1.�ܾ� �߰�  2.�ܾ� �˻� 3.�ܾ� ���� ");
				select = sc.nextInt();
			} else if (select == 1) {
				System.out.println("�߰��Ͻ� �ܾ� �Է�");
				st.put(""+sc.next(),""+sc.next());
				System.out.print("�Է� �Ϸ�.");
			}else if(select==2){
				System.out.print("�ܾ� �Է�:");
				String key = sc.next();
				if(key.equals("quit"))
				break;
				System.out.println("�ܾ��� �ǹ̴� "+st.get(key));
			} else if (select == 3) {
				System.out.println("�ܾ� ����");
				st.remove(sc.next());
				System.out.println("���� ��");
			}
		} while (true);
	}

}
