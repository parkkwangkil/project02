package test03;

import java.util.HashSet;
import java.util.Set;

public class FindDupplication {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] dog = { "�ʷ�", "������", "�۸���", "������" };
		for (String a : dog)
			if (!s.add(a))
				System.out.println("�ߺ��ܾ� :" + a);
		System.out.println(s.size() + "�ߺ��ܾ�:" + s);

	}

}
