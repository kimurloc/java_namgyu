package ch07;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

public class ConnectionPoolExample {

    private static DataSource dataSource;

    static {
        // 1. HikariCP 설정을 위한 HikariConfig 객체 생성
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/board_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
        config.setUsername("root");
        config.setPassword("password");

        // 커넥션 풀 옵션 세부 설정
        config.setMaximumPoolSize(10); // 풀에 보관할 최대 커넥션 개수
        config.setMinimumIdle(5); // 풀에서 유효 상태로 대기할 최소 커넥션 개수
        config.setConnectionTimeout(30000); // 커넥션 획득 대기 최대 시간 (30초)
        config.setIdleTimeout(600000); // 쉬는 커넥션이 풀에서 제거되기 전 최대 유휴 시간 (10분)

        // 2. 설정 정보를 기반으로 HikariDataSource 생성 (DataSource 인터페이스로 업캐스팅하여 관리)
        dataSource = new HikariDataSource(config);
    }

    public static void main(String[] args) {
        // 커넥션 풀에서 커넥션을 대여하여 조회 작업 실행
        selectMemberWithPool(1);
    }

    public static void selectMemberWithPool(int memberId) {
        String sql = "SELECT id, email, name FROM member WHERE id = ?";

        // dataSource.getConnection() 호출 시 새로운 연결을 생성하지 않고 풀에서 기존 연결을 대여해 옴
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setInt(1, memberId);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String email = rs.getString("email");
                    String name = rs.getString("name");
                    System.out.println("조회 완료 - ID: " + id + ", 이메일: " + email + ", 이름: " + name);
                } else {
                    System.out.println("해당 ID의 회원이 존재하지 않습니다.");
                }
            }

        } catch (SQLException e) {
            System.out.println("데이터베이스 조회 중 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
        // try-with-resources에 의해 conn.close()가 호출되면 물리적 연결이 끊어지지 않고 커넥션 풀로 반납됨
    }
}