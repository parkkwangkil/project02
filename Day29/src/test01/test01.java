package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test01 {

	public static void main(String[] args) {
		Connection con = null;
		// 1. ����̹� �ε�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://70.12.109.96:3306/java";
			String id = "root";
			String pw = "sds902";
			try {
				con = DriverManager.getConnection(url, id, pw);
				System.out.println("Ŀ�ؼ� ���� �Ϸ�");
			} catch (SQLException e) {
				System.out.println("�ɳ˼� ����");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

		}
	}
}
