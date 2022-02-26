package tn.esprit.pidev.controllers.Espace_offre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "root";   //DB username
    private static String password = "";
    private static Connection con; //database connection object
    private static String urlstring="jdbc:mysql://localhost:3306/pidevdbb"; //database URL

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(urlstring, username, password);
                System.out.println("Connected");
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found.");
        }
        return con;
    }
}