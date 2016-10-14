package work04;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Select {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		PreparedStatement pstm = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �ε� �׽�Ʈ �Ϸ�!");

			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";

			con = DriverManager.getConnection(url, id, pw);
			System.out.println("����̹� ���� �Ϸ�");

			String sql = "select * from smartphone";

			pstmt = (PreparedStatement) con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				int phone_id = rs.getInt(1);
				String company = rs.getString(2);
				String model = rs.getString(3);
				int price = rs.getInt(4);
				String year = rs.getString(5);
				System.out.println(phone_id + company + model + price + year);
				;
			}

		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("exception �߻�");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
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