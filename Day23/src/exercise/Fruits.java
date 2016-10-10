package exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Fruits {

	public static void main(String[] args) {
		String[] s = {"���","��","�ٳ���"}; // 0-2
		ArrayList list = new ArrayList(Arrays.asList(s));

		list.add("����");
		System.out.println(list); // [���, ��, �ٳ���, ����]
        list.add(2,"�ڸ�");
        System.out.println(list); // [���, ��, �ڸ�, �ٳ���, ����]
        System.out.println(list.get(3)); //�ٳ���
        System.out.println(list.contains("���")); // true
        System.out.println(list.indexOf("���")); // 0

	}

}
