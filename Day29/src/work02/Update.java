package work02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.net.ssl.SSLEngineResult.Status;

public class Update {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �׽�Ʈ �Ϸ�");

			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";

			con = DriverManager.getConnection(url, id, pw);
			System.out.println("Ŀ�ؼ� ���� �׽�Ʈ �Ϸ�!");

			Scanner sc = new Scanner(System.in);
			System.out.println("ȸ���");
			String company = sc.nextLine();
			System.out.println("�𵨸�");
			String model = sc.nextLine();
			System.out.println("�ݾ�");
			int price = sc.nextInt();
			System.out.println("��ó�");
			String year = sc.next();

			String sql = "update * smartphone set price  =1000 where phone_id=4;";

			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("sql ����:" + result);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException�߻�");
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		if (con != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}