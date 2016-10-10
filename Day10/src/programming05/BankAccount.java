package programming05;

public class BankAccount {

	private String name; // 이름
	private int accountnumber; // 계좌
	private int balance; // 잔액
	private double rate; // 이자율

	public BankAccount(){ 
	this.name ="공백";
	this.accountnumber =0;
	this.balance = 0;
	this.rate =0;
			
	}

	public BankAccount(String name, int accountnumber, int balance, double rate) {
		this.name = name;
		this.accountnumber = accountnumber;
		this.balance = balance;
		this.rate = rate;
	}

	// set 선언
	public void setName(String name) {
		name = name;
	}

	public void setAccountNumber(int accountnumber) {
		accountnumber = accountnumber;
	}

	public void setBalance(int balance) {
		balance = balance;
	}

	public void setRate(double rate) {
		rate = rate;
	}

	// set 종료

	public String getName() {
		return name;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public int getBalance() {
		return balance;

	}

	public double getRate() {
		return rate;
	}
	// get문 종료

	public String toString() {
		return "이름" + getName() + name + "계좌" + getAccountnumber() + accountnumber + "잔액" + getBalance() + balance
				+ "이자율" + getRate() + rate + "%";
	}

}
