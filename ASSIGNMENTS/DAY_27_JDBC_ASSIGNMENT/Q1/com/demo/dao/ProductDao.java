package DAY_27_JDBC_ASSIGNMENT.Q1.com.demo.dao;

import DAY_27_JDBC_ASSIGNMENT.Q1.com.demo.beans.Product;

import java.util.List;


public interface ProductDao {

	boolean save(Product product);

	List<Product> findAll();

	Product getById(int pid);

	boolean updateProduct(int pid, int qty, double pr);

	boolean deleteById(int pid);

	void closeConnection();

	List<Product> displayByQTY(int qty);

}
