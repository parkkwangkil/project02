package test08;

import test01.BankAccount;

public class Test {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		BankAccount b3 = new BankAccount();
		
		b1.balance = 1000;
		b2.balance = 1000;
		b3.balance = 1000;
		///////
		
		BankAccount[] b = new BankAccount[3]; // 객체 3개 아님 참조 변수 3개만 생성 
		for(int i=0; i<b.length; i++){
			b[i] =new BankAccount();
		}
		for(int i=0; i<b.length; i++){
			b[i].balance = 1000;
		}

	}

}
