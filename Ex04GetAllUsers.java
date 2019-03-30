import java.sql.*;
import java.util.Scanner;

public class Ex04GetAllUsers {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/Users?user=postgres&password=password";
        Connection conn = DriverManager.getConnection(url);
        String sqlQuery = "SELECT * FROM user1;";
        PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
        ResultSet rs = pstmt.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getString("username"));
        }
    }
}