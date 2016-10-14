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
			System.out.println("드라이버 테스트 완료");

			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";

			con = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 생성 테스트 완료!");

			Scanner sc = new Scanner(System.in);
			System.out.println("회사명");
			String company = sc.nextLine();
			System.out.println("모델명");
			String model = sc.nextLine();
			System.out.println("금액");
			int price = sc.nextInt();
			System.out.println("출시년");
			String year = sc.next();

			String sql = "update * smartphone set price  =1000 where phone_id=4;";

			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("sql 실행:" + result);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException발생");
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