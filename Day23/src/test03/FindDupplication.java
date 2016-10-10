package test03;

import java.util.HashSet;
import java.util.Set;

public class FindDupplication {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] dog = { "ÃÊ·Õ", "½ºÇÇÃ÷", "¸Û¸ÛÀÌ", "½ºÇÇÃ÷" };
		for (String a : dog)
			if (!s.add(a))
				System.out.println("Áßº¹´Ü¾î :" + a);
		System.out.println(s.size() + "Áßº¹´Ü¾î:" + s);

	}

}
