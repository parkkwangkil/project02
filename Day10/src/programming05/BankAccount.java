package programming05;

public class BankAccount {

	private String name; // �̸�
	private int accountnumber; // ����
	private int balance; // �ܾ�
	private double rate; // ������

	public BankAccount(){ 
	this.name ="����";
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

	// set ����
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

	// set ����

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
	// get�� ����

	public String toString() {
		return "�̸�" + getName() + name + "����" + getAccountnumber() + accountnumber + "�ܾ�" + getBalance() + balance
				+ "������" + getRate() + rate + "%";
	}

}
