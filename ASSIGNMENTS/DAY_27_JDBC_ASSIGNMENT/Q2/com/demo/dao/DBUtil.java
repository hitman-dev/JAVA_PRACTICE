package DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    static Connection conn;

    static {
        conn = null;
    }

    public static Connection getMyConnection() {
        if (conn == null) {
            try {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                String url = "jdbc:mysql://localhost:3306/userdata";
                conn = DriverManager.getConnection(url, "root", "root");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void closeMyConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
