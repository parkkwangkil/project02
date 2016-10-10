package test08;

public class Test08 {

	public class BankAccount {
		// 필드 설계 부분
		// 객체 내부의 잔액 정보를 저장하고 유지 하는 멤버 변수
		int balance;

		// 메서드 설계부분
		// 입금하기
		void deposit(int money) { // 입금

			balance += money;
		}

		void withdraw(int money) {// 출금
			// balance -= money;
			if (balance >= money) {
				balance -= money;
			} else {
				System.out.println("출금 안해");
			}
		}

		int getBalance() { // 잔액 정보를 객체 밖으로 내보내기 (참조 변수가 있는 곳으로 내보내기)
			return balance;

		}

		public void addInterest() {
			 balance += (int)(balance*0.075);
		}
	}
}