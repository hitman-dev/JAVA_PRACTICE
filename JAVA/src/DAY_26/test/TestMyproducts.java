package DAY_26.test;
import java.sql.*;

public class TestMyproducts {
        public static void main(String[] args) throws SQLException {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/java";
            Connection con = DriverManager.getConnection(url, "root", "root");
            if (con != null) {
                System.out.println("Connection done!");
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from myproducts");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + "\t" +
                            resultSet.getString(2) + "\t" +
                            resultSet.getInt(3) + "\t" +
                            resultSet.getFloat(4) + "\t" +
                            resultSet.getDate(5));
                }
            } else {
                System.out.println("Connection not found!");
            }
        }
    }

