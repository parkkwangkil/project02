package exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Fruits {

	public static void main(String[] args) {
		String[] s = {"사과","배","바나나"}; // 0-2
		ArrayList list = new ArrayList(Arrays.asList(s));

		list.add("포도");
		System.out.println(list); // [사과, 배, 바나나, 포도]
        list.add(2,"자몽");
        System.out.println(list); // [사과, 배, 자몽, 바나나, 포도]
        System.out.println(list.get(3)); //바나나
        System.out.println(list.contains("사과")); // true
        System.out.println(list.indexOf("사과")); // 0

	}

}
