package utils;
import java.sql.*;
public class DBConnection {
    public Connection createConnection(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/theatre?user=root&password=root");
            return conn;
        } catch(SQLException e) {
            System.err.println(e);
            return null;
        }
    }
}