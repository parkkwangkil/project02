package test01;

import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 BookDao dao = new BookDao();
	        dao.createConnection();
	        Scanner scan = new Scanner(System.in);
	         
	        String title,publisher,year;
	        int bookId,price;
	         
	        BookVO book;
	        List<BookVO> bookList;
	         
	        while(true){
	            System.out.println
	                ("1:å�߰� 2:å���� 3:å���� 4:å��ȸ 5:��üå��� -1:����");
	            System.out.print("�Է�>>");
	            int select = scan.nextInt();
	             
	            if(select == -1)
	                break;
	             
	            switch(select){
	            case 1: // å �߰�
	                System.out.print("����:");
	                title = scan.nextLine();
	                System.out.println("���ǻ�:");
	                publisher = scan.next();
	                System.out.println("���ǳ⵵:");
	                year = scan.next();
	                System.out.println("����:");
	                price = scan.nextInt();
	                 
	                book = new BookVO(title, publisher, year, price);
	                System.out.println("�߰� ���:"+dao.insertBook(book));
	                break;
	            case 2: // å ����
	                System.out.print("������ å ��ȣ:");
	                bookId = scan.nextInt();
	                System.out.println("���ο� ����:");
	                price = scan.nextInt();
	                System.out.println("���ο� �⵵:");
	                year = scan.next();
	                 
	                book = new BookVO(bookId, year, price);
	                System.out.println("���� ���:"+dao.updateBook(book));
	                break;
	            case 3: // å ����
	                System.out.println("������ å ��ȣ");
	                bookId = scan.nextInt();
	                 
	                System.out.println("���� ���:"+dao.deleteBook(bookId));
	                break;
	            case 4: // å �˻�
	                System.out.println("�˻��� å ��ȣ");
	                bookId = scan.nextInt();
	                 
	                book = dao.selectBook(bookId);
	                if(book==null){
	                    System.out.println("�ش� ��ȣ�� å�� �����ϴ�.");
	                }else{
	                    System.out.println(book);
	                }
	                break;
	            case 5: // ��� å ��Ϻ���
	                bookList = dao.selectBookList();
	                 
	                if(bookList.size()==0){
	                    System.out.println("���� ��ϵ� å�� �����ϴ�.");
	                }else{
	                    for(BookVO b: bookList){
	                        System.out.println(b);
	                    }
	                }
	                break;
	            }
	        }
	        System.out.println("--�������� ���α׷� ����--");
	    }
	}