package test05;

public class BankAccount {
	private String ownerName; // 계좌 소유주 이름
	private String accountNumber; // 계좌 번호
	private String password; // 비밀번호(덧셈뺄셈 계산용이 아니므로 int 사용하지 않음)
	private int balance; // 잔액 정보

	private static final int acNumSeed = 11111; // 계좌번호를 부여하기위한 기본값
	private static int customerCount = 0; // 회원 수

	public static int getCustomerCount() {
		return customerCount;
	}

	/////////////////////////////////////////////////////////
	public BankAccount(String name, String password, int balance) {
		// 사용자의 이름, 비밀번호, 초기금액을 입력받아서 은행계좌 객체를 생성.
		this.ownerName = name;
		this.password = password;
		this.balance = balance;
		this.accountNumber = (acNumSeed + customerCount) + "";
		customerCount++;
	}

	// 입금 메소드
	public void deposit(int money) {
		if (money > 0) {
			balance += money;
		} else {
			System.out.println("입금액 정보가 이상합니다.");
		}
	}

	// 출금 메소드
	public void withdraw(int money) {
		if (money <= balance) {
			balance -= money;
		} else {
			System.out.println("잔액부족");
		}
	}

	// 비밀번호 확인 메소드
	public boolean passwordCheck(String password) {
		return (this.password.equals(password));
	}

	////// getter/setter/////////////////////////////////////////////////////////////
	public String getOwnerName() {
		return ownerName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	////////////////////////////////////////////////////////////////////////////////
	public void printAccount() {
		System.out.println("***********계좌 정보**************");
		System.out.println("* 소유주 : " + ownerName);
		System.out.println("* 계좌번호 : " + accountNumber);
		System.out.println("* 잔액 : " + balance);
		System.out.println("**********************************");
	}
}
