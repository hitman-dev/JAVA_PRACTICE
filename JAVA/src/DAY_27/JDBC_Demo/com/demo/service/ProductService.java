package DAY_27.JDBC_Demo.com.demo.service;

import java.util.List;
import DAY_27.JDBC_Demo.com.demo.beans.Product;


public interface ProductService {

	boolean addNewProduct();

	List<Product> displayAll();

	Product displayById(int pid);

	boolean updateProduct(int pid, int qty, double pr);

	boolean deleteById(int pid);

	void closeConnection();

}
