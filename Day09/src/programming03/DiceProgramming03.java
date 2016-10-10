package programming03;

import java.rmi.dgc.DGC;

public class DiceProgramming03 {

	public static void main(String[] args) {
		Dice dice = new Dice();
		dice.roll();
		for(int i=0; i<6; i++){
			
		}
		dice.roll();
		System.out.println(dice.getDice());
	} 

}
