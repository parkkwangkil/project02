package programming07;

import java.util.HashSet;

public class Lotto {
	HashSet<Integer> hs = new HashSet<Integer>();
	public Lotto(){
		int lotto;
		for(int i=0; i<6; i++){
			do{
				lotto = (int) ((Math.random()*44)+1);
			}while(hs.contains(lotto));
			hs.add(lotto);
		}
	}

}
