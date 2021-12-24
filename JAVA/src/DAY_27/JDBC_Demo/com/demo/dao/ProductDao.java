package DAY_27.JDBC_Demo.com.demo.dao;

import java.util.List;
import DAY_27.JDBC_Demo.com.demo.beans.Product;


public interface ProductDao {

	boolean save(Product product);

	List<Product> findAll();

	Product getById(int pid);

	boolean updateProduct(int pid, int qty, double pr);

	boolean deleteById(int pid);

	void closeConnection();

}
