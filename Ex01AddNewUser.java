import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex01AddNewUser {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String nick = sc.nextLine();
        System.out.println("Введите пароль:");
        String password = sc.nextLine();

        String url = "jdbc:postgresql://localhost:5432/Users?user=postgres&password=password";
        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();
        String sqlQuery = "INSERT INTO user1(username, password) " +
                "VALUES ('" + nick + "', '" + password + "');";
        stmt.executeUpdate(sqlQuery);
    }
}