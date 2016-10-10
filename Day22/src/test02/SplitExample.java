package test02;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디 , 이름 , 패쓰워드";

		String[] token = str.split(",");
		for (String token1 : token) {
			System.out.println(token);
		}
		System.out.println(str);
		////////////////////////////////////////////////
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			String token2 = st.nextToken();
			System.out.println(token2);
		}

	}

}
