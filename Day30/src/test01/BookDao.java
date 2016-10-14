package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 프로그램 진행 중에 데이터 베이스 작업이 필요한 시점에 
// 아래의 BookDao 클래스 객체를 활용하도록 설계
public class BookDao {
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
    private final String DB_ID = "root";
    private final String DB_PW = "sds902";
     
    private Connection con;
     
    public BookDao(){
        try {
            // 1. 드라이버 로딩
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 오류");
            e.printStackTrace();
        }
    }
     
    public void createConnection(){
        try {
            // 2. 커넥션 연결
            con = DriverManager.getConnection(DB_URL,DB_ID,DB_PW);
            System.out.println("데이터베이스에 연결이 설정되었습니다.");
        } catch (SQLException e) {
            System.out.println("커넥션 생성 오류");
            e.printStackTrace();
        }
    }
     
    public void closeConnection(){
        try {
            // 7. 커넥션 종료
            con.close();
            System.out.println("데이터베이스에 연결이 종료되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // DB에 Book 한권의 정보를 입력해 주는 메소드
    public int insertBook(BookVO b){
        PreparedStatement pstmt = null;
        int result = 0;
         
        try {
            // 3. SQL 명령어 작성
            String sql = "INSERT INTO BOOKS(TITLE,PUBLISHER,PRICE,YEAR)"
                    + "VALUES(?,?,?,?)";
            // 4. PreparedStatement 객체 생성
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, b.getTitle());
            pstmt.setString(2, b.getPublisher());
            pstmt.setInt(3, b.getPrice());
            pstmt.setString(4, b.getYear());
             
            // 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기
            result = pstmt.executeUpdate();         
        } catch (SQLException e) {
            System.out.println("Dao insert 에러");
            e.printStackTrace();
        } finally {
            // 7. 사용이 끝난 자원 반납
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
     
    public int updateBook(BookVO b){
        PreparedStatement pstmt = null;
        int result = 0;
         
        try {
            // 3. SQL 명령어 작성
            String sql = "UPDATE BOOKS SET PRICE=?,YEAR=? WHERE BOOK_ID=?";
            // 4. PreparedStatement 객체 생성
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, b.getPrice());
            pstmt.setString(2, b.getYear());
            pstmt.setInt(3, b.getBookId());
             
            // 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기
            result = pstmt.executeUpdate();         
        } catch (SQLException e) {
            System.out.println("Dao update 에러");
            e.printStackTrace();
        } finally {
            // 7. 사용이 끝난 자원 반납
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
     
    public int deleteBook(int bookId){
        PreparedStatement pstmt = null;
        int result = 0;
         
        try {
            // 3. SQL 명령어 작성
            String sql = "DELETE FROM BOOKS WHERE BOOK_ID=?";
            // 4. PreparedStatement 객체 생성
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, bookId);
             
            // 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기
            result = pstmt.executeUpdate();         
        } catch (SQLException e) {
            System.out.println("Dao delete 에러");
            e.printStackTrace();
        } finally {
            // 7. 사용이 끝난 자원 반납
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
     
    // DB에서 특정 번호의 책 1권을 조회하는 기능
    public BookVO selectBook(int bookId){
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        BookVO resultBook = null;
        try {
            // 3. SQL 명령어 작성
            String sql = "SELECT BOOK_ID,TITLE,YEAR,PRICE,PUBLISHER "
                    +"FROM BOOKS WHERE BOOK_ID=?";
            // 4. PreparedStatement 객체 생성
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, bookId);
 
            // 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기
            rs = pstmt.executeQuery();
             
            if(rs.next()){
                resultBook = new BookVO();
                resultBook.setBookId(rs.getInt(1));
                resultBook.setTitle(rs.getString(2));
                resultBook.setYear(rs.getString(3));
                resultBook.setPrice(rs.getInt(4));
                resultBook.setPublisher(rs.getString(5));
            }
        } catch (SQLException e) {
            System.out.println("Dao update 에러");
            e.printStackTrace();
        } finally {
            // 7. 사용이 끝난 자원 반납
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultBook;
    }
     
    public List<BookVO> selectBookList(){
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<BookVO> bookList = new ArrayList<>();
        try {
            // 3. SQL 명령어 작성
            String sql = "SELECT BOOK_ID,TITLE,YEAR,PRICE,PUBLISHER "
                    +"FROM BOOKS";
             
            // 4. PreparedStatement 객체 생성
            pstmt = con.prepareStatement(sql);
 
            // 5. 작성한 SQL 문장 데이터베이스에 보내서 실행시키기
            rs = pstmt.executeQuery();
             
            while(rs.next()){
                BookVO resultBook = new BookVO();
                resultBook.setBookId(rs.getInt(1));
                resultBook.setTitle(rs.getString(2));
                resultBook.setYear(rs.getString(3));
                resultBook.setPrice(rs.getInt(4));
                resultBook.setPublisher(rs.getString(5));
                 
                bookList.add(resultBook); // 책 한권을 리스트에 담기              
            }
        } catch (SQLException e) {
            System.out.println("Dao update 에러");
            e.printStackTrace();
        } finally {
            // 7. 사용이 끝난 자원 반납
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return bookList;        
    }
}