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
        // ����ڰ� �Է��� ���¹�ȣ�� ��ȿ���� �˻��� �� ���̴� ����.
        boolean isExistAccount = false; 
 
        while (true) {
            System.out.println("\n -- 1:���� 2:�Ա� 3:��� 4:������ȸ  -1:���� -- ");
            System.out.print(" -- select >");
            int select = input.nextInt();
 
            if (select == -1)
                break;
 
            switch (select) {
            case 1: // ����
                System.out.print("�̸�:");
                name = input.next();
                System.out.print("��й�ȣ:");
                password = input.next();
                System.out.print("�ʱ�ݾ�:");
                initMoney = input.nextInt();
                 
                // ����ڿ��� �Է¹��� ������ ���� ��ü ����
                account = new BankAccount(name, password, initMoney);
                customerList.add(account);// �� ����Ʈ�� �߰�
                System.out.println("ȸ������ �Ϸ�");
                account.printAccount(); // ������ �������� ���
                break;
            case 2: // �Ա�
                System.out.print("�Ա��� ���¹�ȣ �Է�:");
                acNum = input.next();
                 
                // ���� �Է��� ���¹�ȣ�� ��ġ�ϴ� ���¸�
                // �� ��Ͽ��� ã��
                for (int i = 0; i < customerList.size(); i++) {
                    if (acNum.equals(customerList.get(i).getAccountNumber())) {
                        System.out.print("���Ա�?:");
                        inputMoney = input.nextInt();
                        customerList.get(i).deposit(inputMoney);
                        System.out.println("�ԱݿϷ�");
                        isExistAccount = true;
                        break; // ���� ã�����Ƿ� �ݺ�����
                    }
                }
                 
                if(isExistAccount==false){
                    System.out.println("��ȿ���� ���� ���¹�ȣ �Դϴ�.");
                }
                isExistAccount = false;
                break;
            case 3: // ���
                System.out.print("����� ���¹�ȣ �Է�:");
                acNum = input.next();
                System.out.print("�����?:");
                inputMoney = input.nextInt();
                System.out.print("��й�ȣ:");
                password = input.next();
 
                // ���� �Է��� ���¹�ȣ�� ��ġ�ϴ� ���¸�
                // �� ��Ͽ��� ã��
                for (int i = 0; i < customerList.size(); i++) {
                    // �Ʒ� if�� ���̸� �Է��� ��ȣ�� ��ġ���� ã��
                    if (acNum.equals(customerList.get(i).getAccountNumber())) {
                        // �Ʒ� if�� ���̸� �ش� ���¿� �Էº�й�ȣ ��ġ
                        if (customerList.get(i).passwordCheck(password)) {
                            customerList.get(i).withdraw(inputMoney);
                        } else {
                            System.out.println("��й�ȣ ����");
                        }
                        break; // ���� ã�����Ƿ� �ݺ�����
                    }
                }
                if(isExistAccount==false){
                    System.out.println("��ȿ���� ���� ���¹�ȣ �Դϴ�.");
                }
                isExistAccount = false;
                break;
            case 4: // ���� ��ȸ
                System.out.print("��ȸ�� ���¹�ȣ �Է�:");
                acNum = input.next();
                // ���� �Է��� ���¹�ȣ�� ��ġ�ϴ� ���¸�
                // �� ��Ͽ��� ã��
                for (int i = 0; i < customerList.size(); i++) {
                    if (acNum.equals(customerList.get(i).getAccountNumber())) {
                        customerList.get(i).printAccount();
                        break; // ���� ã�����Ƿ� �ݺ�����
                    }
                }
                if(isExistAccount==false){
                    System.out.println("��ȿ���� ���� ���¹�ȣ �Դϴ�.");
                }
                isExistAccount = false;
                break;
            default:
                System.out.println("�Է��� �߸��Ǿ����ϴ�.");
            }
        }
 
        System.out.println(" -- ���α׷��� ����Ǿ����ϴ�. byebye -- ");
    }
}