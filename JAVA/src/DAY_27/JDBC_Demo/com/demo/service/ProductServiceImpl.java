package DAY_27.JDBC_Demo.com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import DAY_27.JDBC_Demo.com.demo.beans.Product;
import DAY_27.JDBC_Demo.com.demo.dao.ProductDao;
import DAY_27.JDBC_Demo.com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
      private ProductDao productDao;

	public ProductServiceImpl() {
		super();
		productDao=new ProductDaoImpl();
	}

	@Override
	public boolean addNewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr pid");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enetr qty");
		int qty=sc.nextInt();
		System.out.println("enetr price");
		double pr=sc.nextDouble();
		System.out.println("enetr date(dd/mm/yyyy");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return productDao.save(new Product(pid,nm,qty,pr,ldt));
		
	}

	@Override
	public List<Product> displayAll() {
		return productDao.findAll();
	}

	@Override
	public Product displayById(int pid) {
		return productDao.getById(pid);
	}

	@Override
	public boolean updateProduct(int pid, int qty, double pr) {
		return productDao.updateProduct(pid,qty,pr);
	}

	@Override
	public boolean deleteById(int pid) {
		return productDao.deleteById(pid);
	}

	@Override
	public void closeConnection() {
		productDao.closeConnection();
		
	}
      
}
