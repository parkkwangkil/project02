package test01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class BankAccountTest {
    public static void main(String[] args) {
        List<BankAccount> customerList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String name, password, acNum;
        int initMoney, inputMoney;
        BankAccount account;
        // 사용자가 입력한 계좌번호가 유효한지 검사할 때 쓰이는 변수.
        boolean isExistAccount = false; 
 
        while (true) {
            System.out.println("\n -- 1:가입 2:입금 3:출금 4:계좌조회  -1:종료 -- ");
            System.out.print(" -- select >");
            int select = input.nextInt();
 
            if (select == -1)
                break;
 
            switch (select) {
            case 1: // 가입
                System.out.print("이름:");
                name = input.next();
                System.out.print("비밀번호:");
                password = input.next();
                System.out.print("초기금액:");
                initMoney = input.nextInt();
                 
                // 사용자에게 입력받은 정보고 계좌 객체 생성
                account = new BankAccount(name, password, initMoney);
                customerList.add(account);// 고객 리스트에 추가
                System.out.println("회원가입 완료");
                account.printAccount(); // 생성된 계좌정보 출력
                break;
            case 2: // 입금
                System.out.print("입금할 계좌번호 입력:");
                acNum = input.next();
                 
                // 현재 입력한 계좌번호와 일치하는 계좌를
                // 고객 목록에서 찾기
                for (int i = 0; i < customerList.size(); i++) {
                    if (acNum.equals(customerList.get(i).getAccountNumber())) {
                        System.out.print("얼마입금?:");
                        inputMoney = input.nextInt();
                        customerList.get(i).deposit(inputMoney);
                        System.out.println("입금완료");
                        isExistAccount = true;
                        break; // 계좌 찾았으므로 반복종료
                    }
                }
                 
                if(isExistAccount==false){
                    System.out.println("유효하지 않은 계좌번호 입니다.");
                }
                isExistAccount = false;
                break;
            case 3: // 출금
                System.out.print("출금할 계좌번호 입력:");
                acNum = input.next();
                System.out.print("얼마출금?:");
                inputMoney = input.nextInt();
                System.out.print("비밀번호:");
                password = input.next();
 
                // 현재 입력한 계좌번호와 일치하는 계좌를
                // 고객 목록에서 찾기
                for (int i = 0; i < customerList.size(); i++) {
                    // 아래 if가 참이면 입력한 번호와 일치계좌 찾음
                    if (acNum.equals(customerList.get(i).getAccountNumber())) {
                        // 아래 if가 참이면 해당 계좌와 입력비밀번호 일치
                        if (customerList.get(i).passwordCheck(password)) {
                            customerList.get(i).withdraw(inputMoney);
                        } else {
                            System.out.println("비밀번호 오류");
                        }
                        break; // 계좌 찾았으므로 반복종료
                    }
                }
                if(isExistAccount==false){
                    System.out.println("유효하지 않은 계좌번호 입니다.");
                }
                isExistAccount = false;
                break;
            case 4: // 계좌 조회
                System.out.print("조회할 계좌번호 입력:");
                acNum = input.next();
                // 현재 입력한 계좌번호와 일치하는 계좌를
                // 고객 목록에서 찾기
                for (int i = 0; i < customerList.size(); i++) {
                    if (acNum.equals(customerList.get(i).getAccountNumber())) {
                        customerList.get(i).printAccount();
                        break; // 계좌 찾았으므로 반복종료
                    }
                }
                if(isExistAccount==false){
                    System.out.println("유효하지 않은 계좌번호 입니다.");
                }
                isExistAccount = false;
                break;
            default:
                System.out.println("입력이 잘못되었습니다.");
            }
        }
 
        System.out.println(" -- 프로그램이 종료되었습니다. byebye -- ");
    }
}