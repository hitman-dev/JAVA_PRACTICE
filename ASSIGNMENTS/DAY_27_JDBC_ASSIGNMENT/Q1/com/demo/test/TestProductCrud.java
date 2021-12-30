package DAY_27_JDBC_ASSIGNMENT.Q1.com.demo.test;
import DAY_27_JDBC_ASSIGNMENT.Q1.com.demo.beans.Product;
import DAY_27_JDBC_ASSIGNMENT.Q1.com.demo.service.ProductService;
import DAY_27_JDBC_ASSIGNMENT.Q1.com.demo.service.ProductServiceImpl;
import java.util.List;
import java.util.Scanner;


public class TestProductCrud {

	public static void main(String[] args) {
		ProductService ps=new ProductServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.print("""
                    
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    |::::::::::::::::MAIN MENU::::::::::::::::::::|
                    |  1. Add new Product                         |
                    |  2. Delete Product                          |
                    |  3. Update Product                          |
                    |  4. Display All                             |
                    |  5. Display by ID                           |
                    |  6. Display by QTY                          |
                    |  7. Exit                                    |
                    |:::::::::::::::::::::::::::::::::::::::::::::|
                    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                    Enter a choice:\s""");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					boolean status=ps.addNewProduct();
					if(status) {
						System.out.println("product added");
					}
					break;
				case 2:
					System.out.println("enetr id");
					int pid=sc.nextInt();
					status=ps.deleteById(pid);
					if(status) {
						System.out.println("deleted successfully");
					}
					else {
						System.out.println("not found");
					}

					break;
				case 3:
					System.out.println("enetr id");
					pid=sc.nextInt();
					System.out.println("enetr qty");
					int qty=sc.nextInt();
					System.out.println("enter price");
					double pr=sc.nextDouble();
					status=ps.updateProduct(pid,qty,pr);
					if(status) {
						System.out.println("update successfully");
					}
					else {
						System.out.println("not found");
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
				case 5:
					System.out.println("enetr Id to search");
					pid=sc.nextInt();
					Product p=ps.displayById(pid);
					if(p!=null) {
						System.out.println(p);
					}
					else {
						System.out.println("not found");
					}
					break;
				case 6:
					System.out.print("Enter QTY to search: ");
					qty=sc.nextInt();
					List<Product> productList = ps.displayByQTY(qty);
					if (productList != null) {
						System.out.println("Products with QTY less than given price are: ");
						productList.forEach(System.out::println);
					} else {
						System.out.println("No Such Products found");
					}

					break;

				case 7:
					sc.close();
					ps.closeConnection();
					break;


			}
			
		
		}while(choice!=7);

	}

}
