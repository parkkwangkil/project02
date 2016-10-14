package test03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
			// finally���� close �ϱ� ���� ���� try �ۿ��� ����
			Statement stmt = null;
			Connection con = null;
			// 1. ����̹� �ε�
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("����̹� �ε� �׽�Ʈ �Ϸ�!");

				String url = "jdbc:mysql://127.0.0.1:3306/java";
				String id = "root";
				String pw = "sds902";

				// 2. Ŀ�ؼ� ���� ����
				con = DriverManager.getConnection(url, id, pw);
				System.out.println("Ŀ�ؼ� ���� �׽�Ʈ �Ϸ�!");

				// 3. SQL ��ɾ� �ۼ�
				Scanner scan = new Scanner(System.in);
	            System.out.print("����:");
	            String title = scan.nextLine();
	            System.out.print("���ǻ�:");
	            String publisher = scan.next();
	            System.out.print("����:");
	            int price = scan.nextInt();
	            System.out.print("���ǳ⵵:");
	            String year = scan.next();
	             
	            String sql = "insert into books(title,publisher,price,year)"
	                    + "values('"+title+"','"+publisher+"',"+price+",'"+price+"')";
				//String sql = "insert into books(title,publisher,price,year)" + "values('�̰��� �ڹٳ�','�Ѻ�',31000,'2017')";

				// 4. ������Ʈ ��Ʈ
				stmt = con.createStatement();

				// 5. ��ɾ� -> 5.1 executeupdate : insert, update, delete�� �ش�
				int result = stmt.executeUpdate(sql);
				// 6 5���� ���� ����� Ȯ��
				System.out.println("sql ���� �Ϸ�" + result);

			} catch (ClassNotFoundException e) {
				System.out.println("����̹� �ε� ����");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("SQLException�߻�");
				e.printStackTrace();
			} finally {
				// 7 �ڿ��ݳ�
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
