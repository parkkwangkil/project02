package test06;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> strlist = new LinkedList<>();
		strlist.add("jsp");
		strlist.add("spring");
		strlist.add("java");
		strlist.add("android");
		strlist.add("oracle");
		
		System.out.println(strlist);
		System.out.println("strList�� ������ " + strlist.size());
		System.out.println("strList�� 2�� ����" + strlist.get(2));
		////////////////
		strlist.remove(1);
		System.out.println("1�� ���� �� strlist�� ������ " +strlist.size());
		System.out.println("1�� ���� �� strlist�� 2�� ����"+ strlist.get(2));

	}

}
