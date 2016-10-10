package test05;

public class BankAccount {
	private String ownerName; // ���� ������ �̸�
	private String accountNumber; // ���� ��ȣ
	private String password; // ��й�ȣ(�������� ������ �ƴϹǷ� int ������� ����)
	private int balance; // �ܾ� ����

	private static final int acNumSeed = 11111; // ���¹�ȣ�� �ο��ϱ����� �⺻��
	private static int customerCount = 0; // ȸ�� ��

	public static int getCustomerCount() {
		return customerCount;
	}

	/////////////////////////////////////////////////////////
	public BankAccount(String name, String password, int balance) {
		// ������� �̸�, ��й�ȣ, �ʱ�ݾ��� �Է¹޾Ƽ� ������� ��ü�� ����.
		this.ownerName = name;
		this.password = password;
		this.balance = balance;
		this.accountNumber = (acNumSeed + customerCount) + "";
		customerCount++;
	}

	// �Ա� �޼ҵ�
	public void deposit(int money) {
		if (money > 0) {
			balance += money;
		} else {
			System.out.println("�Աݾ� ������ �̻��մϴ�.");
		}
	}

	// ��� �޼ҵ�
	public void withdraw(int money) {
		if (money <= balance) {
			balance -= money;
		} else {
			System.out.println("�ܾ׺���");
		}
	}

	// ��й�ȣ Ȯ�� �޼ҵ�
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
		System.out.println("***********���� ����**************");
		System.out.println("* ������ : " + ownerName);
		System.out.println("* ���¹�ȣ : " + accountNumber);
		System.out.println("* �ܾ� : " + balance);
		System.out.println("**********************************");
	}
}
