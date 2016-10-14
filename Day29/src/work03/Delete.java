package work03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Delete {

	public static void main(String[] args) {
		Statement stmt = null;
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �׽�Ʈ ");

			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";

			con = DriverManager.getConnection(url, id, pw);
			System.out.println("Ŀ�ؼ� ���� ");

			String sql = "delete from smartphone where phone_id=3;";

			stmt = con.createStatement();

			int result = stmt.executeUpdate(sql);
			System.out.println("sql ���� �Ϸ�" + result);

		} catch (ClassNotFoundException e) {
			System.out.println("����̹�  ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("exception");
			e.printStackTrace();
		} finally {
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