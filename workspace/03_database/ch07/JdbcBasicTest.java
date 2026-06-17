package ch07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcBasicTest {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/board_db?serverTimezone=UTC&useSSL=false";
    private static final String DB_USER = "user1";
    private static final String DB_PASSWORD = "1111";

    public static void main(String[] args){
        selectAllMembers();
        insertMember("haru" + (int)(Math.random()*1000) + "@gmail.com", "1234",
                "newharu", "01077778888", 2);
        selectAllMembers();
        updateMember(3, "3333", "member3", "01033333333");
        deleteMember(1);
    }

    public static void selectAllMembers(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            // connect database by Connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // create sql object by Statement
            stmt = conn.createStatement();

            // execute sql
            rs = stmt.executeQuery("SELECT * FROM member");

            // receive results
            while(rs.next()){
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                System.out.println("id : " + id + ", email : " + email
                        + ", name : " + name + ", phone : " + phone);
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

    public static void insertMember(String email, String password,
                                    String name, String phone, int recommenderId){
        Connection conn = null;
        Statement stmt = null;

        try{
            // connect database by Connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // create sql object by Statement
            stmt = conn.createStatement();

            // execute sql and receive results
            int affectedRows = stmt.executeUpdate("INSERT INTO member (email, password, name, phone, recommender_id) VALUES \n" +
                    "    ('"+email+"', '"+password+"', '"+name+"', '"+phone+"', "+recommenderId+")");
            System.out.println("member registered : " + affectedRows);

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }finally{
            // release resources by desc(prevent nullpointerexception by if)
            try{ if (stmt != null) stmt.close(); }catch(Exception e){}
            try{ if (conn != null) conn.close(); }catch(Exception e){}
        }
    }

    public static void updateMember(int id, String password,
                                    String name, String phone){
        Connection conn = null;
        Statement stmt = null;

        try{
            // connect database by Connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // create sql object by Statement
            stmt = conn.createStatement();

            // execute sql and receive results
            int affectedRows = stmt.executeUpdate("UPDATE member SET password = '"+password+"', " +
                    "name = '"+name+"', phone = '"+phone+"' WHERE id = " + id);
            System.out.println("member info changed : " + affectedRows);

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }finally{
            // release resources by desc(prevent nullpointerexception by if)
            try{ if (stmt != null) stmt.close(); }catch(Exception e){}
            try{ if (conn != null) conn.close(); }catch(Exception e){}
        }
    }

    public static void deleteMember(int id) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // connect database by Connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // create sql object by Statement
            stmt = conn.createStatement();

            // execute sql and receive results
            int affectedRows = stmt.executeUpdate("DELETE FROM member WHERE id = " + id);
            System.out.println("member deleted : " + affectedRows);

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