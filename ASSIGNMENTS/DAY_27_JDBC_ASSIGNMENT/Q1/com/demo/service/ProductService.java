package DAY_27_JDBC_ASSIGNMENT.Q1.com.demo.service;

import DAY_27_JDBC_ASSIGNMENT.Q1.com.demo.beans.Product;

import java.util.List;


public interface ProductService {

	boolean addNewProduct();

	List<Product> displayAll();

	Product displayById(int pid);

	boolean updateProduct(int pid, int qty, double pr);

	boolean deleteById(int pid);

	void closeConnection();

	List<Product> displayByQTY(int qty);

}
