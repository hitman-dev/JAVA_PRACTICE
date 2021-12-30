package DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.dao;
import DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.beans.User;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDaoImpl implements UserDao {
    static Connection conn;
    static PreparedStatement insertUser, checkifexist, displayAll;
    static {
        try {
            conn = DBUtil.getMyConnection();
            insertUser = conn.prepareStatement("insert into userinfo values(?,?,?,?)");
            checkifexist = conn.prepareStatement("select * from userinfo where username=? AND address=?");
            displayAll=conn.prepareStatement("select * from userinfo");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean save(User user) {
        try {
            insertUser.setString(1, user.getUsername());
            insertUser.setString(2, user.getAddress());
            insertUser.setLong(3, user.getMobileno());
            insertUser.setString(4, user.getEmail());
            int n = insertUser.executeUpdate();
            if (n > 0)
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User checkIfExists(String username, String address) {
        Scanner sc = new Scanner(System.in);
        try {
            checkifexist.setString(1,username);
            checkifexist.setString(2,address);
            ResultSet rs=checkifexist.executeQuery();
            if(rs.next()) {
                return new  User(rs.getString(1),rs.getString(2),rs.getLong(3),rs.getString(4));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
//

    }

    @Override
    public List<User> displayAll() {
        List<User> ulist=new ArrayList<>();
        try {
            ResultSet rs=displayAll.executeQuery();
            while(rs.next()) {
                ulist.add(new  User(rs.getString(1),rs.getString(2),rs.getLong(3),rs.getString(4)));
            }
            if(ulist.size()>0) {
                return ulist;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void closeConnection() {
        DBUtil.closeMyConnection();
    }



}
