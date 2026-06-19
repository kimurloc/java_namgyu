package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcMemberTest {
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
        login("namu@gmail.com", "pwd789");
        login("haru@gmail.com", "pwd123");
        /*insertMember("haru" + (int)(Math.random()*1000) + "@gmail.com", "1234", "뉴하루", "01022221111", 2);
        try{
            insertMember("haru" + (int)(Math.random()*1000) + "@gmail.com", "1234", "뉴하루", "01012345678910", 2);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            insertMember("haru" + (int)(Math.random() * 1000)+"@gmail.com", "1234", "뉴하루", "010-1234-5678".replace("-", ""), 2);
            System.out.println("member registered");
        }*/
        try{
            login("haru@gmail.com", "");
        }catch(LoginFailException e){
            System.out.println(e.getMessage());
        }
    }

    public static void login(String email, String password) throws LoginFailException{

        if(email == null || email.isBlank() || password == null || password.isBlank()){
            throw new LoginFailException("email or password is null");
        }

        String sql = "SELECT * FROM member WHERE email = '"+email+"' AND password = '"+password+"'";

        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

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
        }
    }

    static void insert(int memberId, String title, String content){
        String sql = "INSERT INTO post (member_id, title, content) VALUES ("+memberId+", '"+title+"', '"+content+"')";

        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement()){

            // execute sql and receive results
            int affectedRows = stmt.executeUpdate(sql);
            System.out.println("post registered : " + affectedRows);

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void insertMember(String email, String password, String name, String phone, int recommenderId){

        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement()){
            if(phone.length() > 11){
                throw new IllegalArgumentException("invalid phone number");
            }
            // 3. SQL 실행
            int affectedRows = stmt.executeUpdate("INSERT INTO member (email, password, name, phone, recommender_id) VALUES \n" +
                    "    ('"+email+"', '"+password+"', '"+name+"', '"+phone+"', "+recommenderId+")");

            System.out.println("회원 등록 완료: " + affectedRows + "건 반영됨.");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void findAll(){
        String sql = "SELECT * FROM post";

        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

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
        }
    }

    static void findById(int id){
        String sql = "SELECT * FROM post WHERE id = ";

        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql + id)){

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
        }
    }

    static void update(int id, String title, String content){
        String sql = "UPDATE post SET title = '"+title+"', " + "content = '"+content+"' WHERE id = ";


        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement()){

            // execute sql and receive results
            int affectedRows = stmt.executeUpdate(sql + id);
            System.out.println("post changed : " + affectedRows);

        }catch(Exception e){
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void delete(int id){
        String sql = "DELETE FROM post WHERE id = ";

        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();) {

            // execute sql and receive results
            int affectedRows = stmt.executeUpdate(sql + id);
            System.out.println("post deleted : " + affectedRows);

        } catch (Exception e) {
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void deleteAll(int memberId){
        String sql = "DELETE FROM post WHERE member_id = ";

        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement()) {

            // execute sql and receive results
            int affectedRows = stmt.executeUpdate(sql + memberId);
            System.out.println("post deleted : " + affectedRows);

        } catch (Exception e) {
            System.out.println("exception occurred : " + e.getMessage());
            e.printStackTrace();
        }
    }
}