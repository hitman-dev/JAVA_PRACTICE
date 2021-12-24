package DAY_26.JDBC_Demo.com.demo.service;
import java.util.List;
import DAY_26.JDBC_Demo.com.demo.beans.Product;


public interface ProductService {

	boolean addNewProduct();

	List<Product> displayAll();

}
