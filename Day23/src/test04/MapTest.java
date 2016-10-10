package test04;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20160001", new Student(20160001, "¹Ú±¤±æ", 010, 011));
		st.put("20160002", new Student(20160002, "¹Ú±¤±æ", 011,012));
		st.put("20160003", new Student(20160003,"¹Ú±¤±æ",012,013));
		System.out.println(st);
		st.remove("2016002");
		st.put("20160003", new Student(20160003, "±¤±æ¹Ú", 014, 001));
		for(Map.Entry<String, Student> s :st.entrySet()){
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("ÇÐ¹ø"+key);
			System.out.println("Á¤º¸"+value);
		}
		
		
		
		

	}

}
