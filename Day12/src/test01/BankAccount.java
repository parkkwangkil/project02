package test01;

public class BankAccount {
	private int balance;
	private String ownerName;
	private String accountNum;


	public BankAccount(int initMoney, String name, String acNum) {
		this.balance = initMoney;
		this.ownerName = name;
		this.accountNum = acNum;
	}

	////////////////////////////
//	public void BankAccout(int initMoney, String name, String acNum) {
//		this.balance = initMoney;
//		this.ownerName = name;
//		this.accountNum = acNum;
//
//	}

	void setBalance(int balance) {
		this.balance = balance;
	}

	void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public int getBalance() {
		return balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println("OK");
		} else
			System.out.println("NO");
	}
	
	public void printAccount(){
		System.out.println("===");
		System.out.println("소유주:"+ ownerName);
		System.out.println("계좌:"+ accountNum);
		System.out.println("잔액"+ balance);
		System.out.println("===");
	}
	public void tranfer(BankAccount other, int money){
		if(balance >=money){
		withdraw(money); // 현재 계좌에서 출금하고
		other.deposit(money); // 전달받은 주소의 계좌 
		System.out.println("완료");
	}else 
		System.out.println("실패");

}
}