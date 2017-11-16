/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {

    Connection c = null;

    public static Connection DBConnect() {

        // String url = "jdbc:sqlite:/root/Desktop/Library/src";
        try {
            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ashri\\Desktop\\LibManSys-master\\Library\\src\\Library.sqlite");
            return c;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        //  System.out.println("Opened database successfully");

    }
}
