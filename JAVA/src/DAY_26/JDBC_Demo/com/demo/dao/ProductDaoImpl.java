package DAY_26.JDBC_Demo.com.demo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import DAY_26.JDBC_Demo.com.demo.beans.Product;


public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static PreparedStatement insprod,selprod;
	static {
		try {
			conn=DBUtil.getMyConnection();
			insprod=conn.prepareStatement("insert into myproduct values(?,?,?,?,?)");
			selprod=conn.prepareStatement("select * from myproduct");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean save(Product product) {
		try {
			insprod.setInt(1,product.getPid());
			insprod.setString(2,product.getPname());
			insprod.setInt(3, product.getQty());
			insprod.setDouble(4, product.getPrice());
			java.sql.Date dt=java.sql.Date.valueOf(product.getLdt());
			insprod.setDate(5, dt);
			int n=insprod.executeUpdate();
			if(n>0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Product> findAll() {
		List<Product> plist=new ArrayList<>();
		try {
			ResultSet rs=selprod.executeQuery();
			while(rs.next()) {
				plist.add(new  Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate()));
			}
			if(plist.size()>0) {
				return plist;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
