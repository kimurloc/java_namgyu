package ch07;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionPoolTest {

    private static DataSource dataSource;

    static{
        HikariConfig config = new HikariConfig("/hikari.properties");
        dataSource = new HikariDataSource(config);
    }

    public static void main(String[] args){
        findAll();
        insert(3, "hello", "world");
        findById(6); //ok
        update(6, "title changed", "content changed");
        delete(13);
        findAll("자바");
        deleteAll(3);
        findAll();
        login("namu@gmail.com", "pwd789");
        login("haru@gmail.com", "pwd123");

        if(dataSource != null){
            ((HikariDataSource)dataSource).close();
        }
    }

    public static void login(String email, String password){
        String sql = "SELECT * FROM member WHERE email = ? AND password = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            // connect database by Connection
            conn = dataSource.getConnection();

            // create sql object by Statement
            pstmt = conn.prepareStatement(sql);

            // execute sql
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();

            // receive results
            if(rs.next()){
                System.out.println("login success");
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                System.out.println("ID : " + id + ", email : " + email + ", name : " + name + ", phone : " + phone);
            }else{
                System.out.println("incorrect id/password");
            }

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }finally{
            // release resources by desc(prevent nullpointerexception by if)
            try{ if (rs != null) rs.close(); }catch(Exception e){}
            try{ if (pstmt != null) pstmt.close(); }catch(Exception e){}
            try{ if (conn != null) conn.close(); }catch(Exception e){}
        }
    }

    static void insert(int memberId, String title, String content){
        String sql = "INSERT INTO post (member_id, title, content) VALUES (?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            // connect database by Connection
            conn = dataSource.getConnection();

            // create sql object by Statement
            pstmt = conn.prepareStatement(sql);

            // execute sql and receive results
            pstmt.setInt(1, memberId);
            pstmt.setString(2, title);
            pstmt.setString(3, content);
            int affectedRows = pstmt.executeUpdate();
            //System.out.println("post registered : " + affectedRows);

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }finally{
            // release resources by desc(prevent nullpointerexception by if)
            try{ if (pstmt != null) pstmt.close(); }catch(Exception e){}
            try{ if (conn != null) conn.close(); }catch(Exception e){}
        }
    }

    static void findAll(){
        findAll("");
    }

    static void findAll(String keyword){
        String sql = "SELECT id, member_id as mid, title, content, view_count AS views, created_at FROM post";

        boolean hasKeyword = (keyword != null && !keyword.equals(""));
        if(hasKeyword){
            sql += " WHERE title LIKE ? OR content LIKE ?";
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            // connect database by Connection
            conn = dataSource.getConnection();

            // create sql object by Statement
            pstmt = conn.prepareStatement(sql);

            // execute sql
            if(hasKeyword){
                pstmt.setString(1, "%" + keyword + "%");
                pstmt.setString(2, "%" + keyword + "%");
            }
            rs = pstmt.executeQuery();

            // receive results
            while(rs.next()){
                int id = rs.getInt("id");
                int memberId = rs.getInt("mid");
                String title = rs.getString("title");
                String content = rs.getString("content");
                int viewCount = rs.getInt("views");
                String createdAt = rs.getString("created_at");
                System.out.println("id : " + id + ", mid : " + memberId + ", title : " + title
                        + ", content : " + content + ", views : " + viewCount + " " + createdAt);
                /*System.out.println("id : " + id + ", title : " + title
                        + ", content : " + content + ", views : " + viewCount + " " + createdAt);*/
            }

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }finally{
            // release resources by desc(prevent nullpointerexception by if)
            try{ if (rs != null) rs.close(); }catch(Exception e){}
            try{ if (pstmt != null) pstmt.close(); }catch(Exception e){}
            try{ if (conn != null) conn.close(); }catch(Exception e){}
        }
    }

    static void findById(int id){
        String sql = "SELECT * FROM post WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            // connect database by Connection
            conn = dataSource.getConnection();

            // create sql object by Statement
            pstmt = conn.prepareStatement(sql);

            // execute sql
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();

            // receive results
            while(rs.next()){
                //int id = rs.getInt("id");
                int memberId = rs.getInt("member_id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                System.out.println("id : " + id + ", mid : " + memberId
                        + ", title : " + title + ", content : " + content);
            }

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }finally{
            // release resources by desc(prevent nullpointerexception by if)
            try{ if (rs != null) rs.close(); }catch(Exception e){}
            try{ if (pstmt != null) pstmt.close(); }catch(Exception e){}
            try{ if (conn != null) conn.close(); }catch(Exception e){}
        }
    }

    static void update(int id, String title, String content){
        String sql = "UPDATE post SET title = ?, content = ? WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            // connect database by Connection
            conn = dataSource.getConnection();

            // create sql object by Statement
            pstmt = conn.prepareStatement(sql);

            // create sql object by Statement
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setInt(3, id);
            //pstmt = conn.prepareStatement(sql);

            // execute sql and receive results
            int affectedRows = pstmt.executeUpdate();
            System.out.println("post changed : " + affectedRows);

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }finally{
            // release resources by desc(prevent nullpointerexception by if)
            try{ if (pstmt != null) pstmt.close(); }catch(Exception e){}
            try{ if (conn != null) conn.close(); }catch(Exception e){}
        }
    }

    static void delete(int id){
        String sql = "DELETE FROM post WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // connect database by Connection
            conn = dataSource.getConnection();

            // create sql object by Statement
            pstmt = conn.prepareStatement(sql);

            // execute sql and receive results
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            pstmt.setInt(1, id);
            System.out.println("post deleted : " + affectedRows);

        } catch (Exception e) {
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        } finally {
            // release resources by desc(prevent nullpointerexception by if)
            try {
                if (pstmt != null) pstmt.close();
            } catch (Exception e) {
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
    }

    static void deleteAll(int memberId){
        String sql = "DELETE FROM post WHERE member_id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // connect database by Connection
            conn = dataSource.getConnection();

            // create sql object by Statement
            pstmt = conn.prepareStatement(sql);

            // execute sql and receive results
            pstmt.setInt(1, memberId);
            int affectedRows = pstmt.executeUpdate();
            System.out.println("post deleted : " + affectedRows);

        } catch (Exception e) {
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        } finally {
            // release resources by desc(prevent nullpointerexception by if)
            try {
                if (pstmt != null) pstmt.close();
            } catch (Exception e) {
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
    }
}
