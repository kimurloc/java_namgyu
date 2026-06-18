package ch07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcPostTest {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/board_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "user1";
    private static final String DB_PASSWORD = "1111";

    public static void main(String[] args){
        findAll();
        insert(3, "hello", "world");
        findById(13);
        update(29, "title changed", "content changed");
        delete(13);
        findAll();
        deleteAll(4);
        findAll();
    }

    static void insert(int memberId, String title, String content){
        String sql = "INSERT INTO post (member_id, title, content) VALUES ("+memberId+", '"+title+"', '"+content+"')";
        Connection conn = null;
        Statement stmt = null;

        try{
            // connect database by Connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // create sql object by Statement
            stmt = conn.createStatement();

            // execute sql and receive results
            int affectedRows = stmt.executeUpdate(sql);
            System.out.println("post registered : " + affectedRows);

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }finally{
            // release resources by desc(prevent nullpointerexception by if)
            try{ if (stmt != null) stmt.close(); }catch(Exception e){}
            try{ if (conn != null) conn.close(); }catch(Exception e){}
        }
    }

    static void findAll(){
        String sql = "SELECT * FROM post";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            // connect database by Connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // create sql object by Statement
            stmt = conn.createStatement();

            // execute sql
            rs = stmt.executeQuery(sql);

            // receive results
            while(rs.next()){
                int id = rs.getInt("id");
                int memberId = rs.getInt("member_id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                int viewCount = rs.getInt("view_count");
                String createdAt = rs.getString("created_at");
                System.out.println("id : " + id + ", mid : " + memberId + ", title : " + title
                        + ", content : " + content + ", views : " + viewCount + " " + createdAt);
            }

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }finally{
            // release resources by desc(prevent nullpointerexception by if)
            try{ if (rs != null) rs.close(); }catch(Exception e){}
            try{ if (stmt != null) stmt.close(); }catch(Exception e){}
            try{ if (conn != null) conn.close(); }catch(Exception e){}
        }
    }

    static void findById(int id){
        String sql = "SELECT * FROM post WHERE id = ";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            // connect database by Connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // create sql object by Statement
            stmt = conn.createStatement();

            // execute sql
            rs = stmt.executeQuery(sql + id);

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
            try{ if (stmt != null) stmt.close(); }catch(Exception e){}
            try{ if (conn != null) conn.close(); }catch(Exception e){}
        }
    }

    static void update(int id, String title, String content){
        String sql = "UPDATE post SET title = '"+title+"', " + "content = '"+content+"' WHERE id = ";
        Connection conn = null;
        Statement stmt = null;

        try{
            // connect database by Connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // create sql object by Statement
            stmt = conn.createStatement();

            // execute sql and receive results
            int affectedRows = stmt.executeUpdate(sql + id);
            System.out.println("post changed : " + affectedRows);

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }finally{
            // release resources by desc(prevent nullpointerexception by if)
            try{ if (stmt != null) stmt.close(); }catch(Exception e){}
            try{ if (conn != null) conn.close(); }catch(Exception e){}
        }
    }

    static void delete(int id){
        String sql = "DELETE FROM post WHERE id = ";
        Connection conn = null;
        Statement stmt = null;

        try {
            // connect database by Connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // create sql object by Statement
            stmt = conn.createStatement();

            // execute sql and receive results
            int affectedRows = stmt.executeUpdate(sql + id);
            System.out.println("post deleted : " + affectedRows);

        } catch (Exception e) {
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        } finally {
            // release resources by desc(prevent nullpointerexception by if)
            try {
                if (stmt != null) stmt.close();
            } catch (Exception e) {
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
    }

    static void deleteAll(int memberId){
        String sql = "DELETE FROM post WHERE member_id = ";
        Connection conn = null;
        Statement stmt = null;

        try {
            // connect database by Connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // create sql object by Statement
            stmt = conn.createStatement();

            // execute sql and receive results
            int affectedRows = stmt.executeUpdate(sql + memberId);
            System.out.println("post deleted : " + affectedRows);

        } catch (Exception e) {
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        } finally {
            // release resources by desc(prevent nullpointerexception by if)
            try {
                if (stmt != null) stmt.close();
            } catch (Exception e) {
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
    }
}
