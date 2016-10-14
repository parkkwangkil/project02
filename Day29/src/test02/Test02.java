package test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test02 {
	public static void main(String[] args) {
		// finally에서 close 하기 위해 변수 try 밖에서 선언
		Statement stmt = null;
		Connection con = null;
		// 1. 드라이버 로딩
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 테스트 완료!");

			String url = "jdbc:mysql://127.0.0.1:3306/java";
			String id = "root";
			String pw = "sds902";

			// 2. 커넥션 연결 생성
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 생성 테스트 완료!");

			// 3. SQL 명령어 작성
			String sql = "insert into books(title,publisher,price,year)" + "values('이것이 자바네','한빛',31000,'2017')";

			// 4. 스테이트 먼트
			stmt = con.createStatement();

			// 5. 명령어 -> 5.1 executeupdate : insert, update, delete에 해당
			int result = stmt.executeUpdate(sql);
			// 6 5번의 생형 결과값 확인
			System.out.println("sql 실행 완료" + result);

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException발생");
			e.printStackTrace();
		} finally {
			// 7 자원반납
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