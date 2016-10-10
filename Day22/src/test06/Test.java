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
		System.out.println("strList의 사이즈 " + strlist.size());
		System.out.println("strList의 2번 원소" + strlist.get(2));
		////////////////
		strlist.remove(1);
		System.out.println("1번 삭제 후 strlist의 사이즈 " +strlist.size());
		System.out.println("1번 삭제 후 strlist의 2번 원소"+ strlist.get(2));

	}

}
