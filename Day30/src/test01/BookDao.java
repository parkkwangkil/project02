package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// ���α׷� ���� �߿� ������ ���̽� �۾��� �ʿ��� ������ 
// �Ʒ��� BookDao Ŭ���� ��ü�� Ȱ���ϵ��� ����
public class BookDao {
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
    private final String DB_ID = "root";
    private final String DB_PW = "sds902";
     
    private Connection con;
     
    public BookDao(){
        try {
            // 1. ����̹� �ε�
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �ε� ����");
            e.printStackTrace();
        }
    }
     
    public void createConnection(){
        try {
            // 2. Ŀ�ؼ� ����
            con = DriverManager.getConnection(DB_URL,DB_ID,DB_PW);
            System.out.println("�����ͺ��̽��� ������ �����Ǿ����ϴ�.");
        } catch (SQLException e) {
            System.out.println("Ŀ�ؼ� ���� ����");
            e.printStackTrace();
        }
    }
     
    public void closeConnection(){
        try {
            // 7. Ŀ�ؼ� ����
            con.close();
            System.out.println("�����ͺ��̽��� ������ ����Ǿ����ϴ�.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // DB�� Book �ѱ��� ������ �Է��� �ִ� �޼ҵ�
    public int insertBook(BookVO b){
        PreparedStatement pstmt = null;
        int result = 0;
         
        try {
            // 3. SQL ��ɾ� �ۼ�
            String sql = "INSERT INTO BOOKS(TITLE,PUBLISHER,PRICE,YEAR)"
                    + "VALUES(?,?,?,?)";
            // 4. PreparedStatement ��ü ����
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, b.getTitle());
            pstmt.setString(2, b.getPublisher());
            pstmt.setInt(3, b.getPrice());
            pstmt.setString(4, b.getYear());
             
            // 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��
            result = pstmt.executeUpdate();         
        } catch (SQLException e) {
            System.out.println("Dao insert ����");
            e.printStackTrace();
        } finally {
            // 7. ����� ���� �ڿ� �ݳ�
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
            // 3. SQL ��ɾ� �ۼ�
            String sql = "UPDATE BOOKS SET PRICE=?,YEAR=? WHERE BOOK_ID=?";
            // 4. PreparedStatement ��ü ����
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, b.getPrice());
            pstmt.setString(2, b.getYear());
            pstmt.setInt(3, b.getBookId());
             
            // 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��
            result = pstmt.executeUpdate();         
        } catch (SQLException e) {
            System.out.println("Dao update ����");
            e.printStackTrace();
        } finally {
            // 7. ����� ���� �ڿ� �ݳ�
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
            // 3. SQL ��ɾ� �ۼ�
            String sql = "DELETE FROM BOOKS WHERE BOOK_ID=?";
            // 4. PreparedStatement ��ü ����
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, bookId);
             
            // 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��
            result = pstmt.executeUpdate();         
        } catch (SQLException e) {
            System.out.println("Dao delete ����");
            e.printStackTrace();
        } finally {
            // 7. ����� ���� �ڿ� �ݳ�
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
     
    // DB���� Ư�� ��ȣ�� å 1���� ��ȸ�ϴ� ���
    public BookVO selectBook(int bookId){
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        BookVO resultBook = null;
        try {
            // 3. SQL ��ɾ� �ۼ�
            String sql = "SELECT BOOK_ID,TITLE,YEAR,PRICE,PUBLISHER "
                    +"FROM BOOKS WHERE BOOK_ID=?";
            // 4. PreparedStatement ��ü ����
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, bookId);
 
            // 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��
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
            System.out.println("Dao update ����");
            e.printStackTrace();
        } finally {
            // 7. ����� ���� �ڿ� �ݳ�
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
            // 3. SQL ��ɾ� �ۼ�
            String sql = "SELECT BOOK_ID,TITLE,YEAR,PRICE,PUBLISHER "
                    +"FROM BOOKS";
             
            // 4. PreparedStatement ��ü ����
            pstmt = con.prepareStatement(sql);
 
            // 5. �ۼ��� SQL ���� �����ͺ��̽��� ������ �����Ű��
            rs = pstmt.executeQuery();
             
            while(rs.next()){
                BookVO resultBook = new BookVO();
                resultBook.setBookId(rs.getInt(1));
                resultBook.setTitle(rs.getString(2));
                resultBook.setYear(rs.getString(3));
                resultBook.setPrice(rs.getInt(4));
                resultBook.setPublisher(rs.getString(5));
                 
                bookList.add(resultBook); // å �ѱ��� ����Ʈ�� ���              
            }
        } catch (SQLException e) {
            System.out.println("Dao update ����");
            e.printStackTrace();
        } finally {
            // 7. ����� ���� �ڿ� �ݳ�
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