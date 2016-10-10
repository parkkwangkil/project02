package test05;

import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
		String s = "aa bb c_ddd e ff";
		StringTokenizer st = new StringTokenizer(s,"_",true);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}
