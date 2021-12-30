package DAY_27_JDBC_ASSIGNMENT.Q1.com.demo.dao;

import DAY_27_JDBC_ASSIGNMENT.Q1.com.demo.beans.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static PreparedStatement insprod,selprod,findById,updateById,delById,findByQTY;
	static {
		try {
			conn=DBUtil.getMyConnection();
			insprod=conn.prepareStatement("insert into myproducts values(?,?,?,?,?)");
			selprod=conn.prepareStatement("select * from myproducts");
			findById=conn.prepareStatement("select * from myproducts where pid=?");
			updateById=conn.prepareStatement("update myproducts set qty=?,price=? where pid=?");
			delById=conn.prepareStatement("delete from myproducts where pid=? ");
			findByQTY=conn.prepareStatement("select * from myproducts where qty>?");
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

	@Override
	public Product getById(int pid) {
		try {
			findById.setInt(1,pid);
			ResultSet rs=findById.executeQuery();
			if(rs.next()) {
				return new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean updateProduct(int pid, int qty, double pr) {
		try {
			updateById.setInt(1, qty);
			updateById.setDouble(2, pr);
			updateById.setInt(3, pid);
            int n= updateById.executeUpdate();
            if(n>0)
            	return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteById(int pid) {
		try {
			delById.setInt(1, pid);
			int n=delById.executeUpdate();
			if(n>0)
            	return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Product> displayByQTY(int qty) {
		List<Product> productListByqty = new ArrayList<>();
		try {
			findByQTY.setInt(1, qty);
			ResultSet rs = findByQTY.executeQuery();
			while (rs.next()) {
				productListByqty.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate()));
			}
			if (productListByqty.size() > 0) {
				return productListByqty;
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
