import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {

    Connection c = null;

    public static Connection DBConnect() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:" + System.getProperty("user.dir") + "/src/Library.sqlite");
            return c;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
