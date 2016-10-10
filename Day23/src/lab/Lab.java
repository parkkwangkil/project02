package lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab {
	public static void main(String[] args) {
		Map<String, String> st = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		int select = 0;
		st.put("Map", "지도");
		st.put("java", "자바");
		st.put("school", "학교");
		do {
			if (select == 0) {
				System.out.println("1.단어 추가  2.단어 검색 3.단어 삭제 ");
				select = sc.nextInt();
			} else if (select == 1) {
				System.out.println("추가하실 단어 입력");
				st.put(""+sc.next(),""+sc.next());
				System.out.print("입력 완료.");
			}else if(select==2){
				System.out.print("단업 입력:");
				String key = sc.next();
				if(key.equals("quit"))
				break;
				System.out.println("단어의 의미는 "+st.get(key));
			} else if (select == 3) {
				System.out.println("단어 삭제");
				st.remove(sc.next());
				System.out.println("삭제 끝");
			}
		} while (true);
	}

}
