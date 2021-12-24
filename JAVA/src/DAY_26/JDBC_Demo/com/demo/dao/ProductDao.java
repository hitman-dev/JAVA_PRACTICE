package DAY_26.JDBC_Demo.com.demo.dao;
import java.util.List;
import DAY_26.JDBC_Demo.com.demo.beans.Product;


public interface ProductDao {

	boolean save(Product product);

	List<Product> findAll();

}
