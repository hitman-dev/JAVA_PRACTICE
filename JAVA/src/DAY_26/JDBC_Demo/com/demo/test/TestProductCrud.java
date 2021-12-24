package DAY_26.JDBC_Demo.com.demo.test;
import java.util.List;
import java.util.Scanner;
import DAY_26.JDBC_Demo.com.demo.beans.Product;
import DAY_26.JDBC_Demo.com.demo.service.ProductService;
import DAY_26.JDBC_Demo.com.demo.service.ProductServiceImpl;


public class TestProductCrud {

	public static void main(String[] args) {
		ProductService ps=new ProductServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. Add new Product\n2. delete product\n3. update product \n");
			System.out.println("4. display All \n5. display by id\n 6.exit\n choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				boolean status=ps.addNewProduct();
				if(status) {
					System.out.println("product added");
				}
				break;
			case 4:
				List<Product>plist=ps.displayAll();
				if(plist!=null) {
					plist.stream().forEach(System.out::println);
				}
				else {
					System.out.println("no product exists");
				}
				break;
			case 6:
				sc.close();
				//ps.closeConnection();
				break;
			}
			
		
		}while(choice!=6);

	}

}
