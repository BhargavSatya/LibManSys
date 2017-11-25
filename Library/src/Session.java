
import java.sql.Connection;

public class Session {

    private static String username;
    private static Connection conn;

    public static void connectDB() {
        conn = DBConnect.DBConnect();
    }

    public static Connection getConn() {
        return conn;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Session.username = username;
    }

}
