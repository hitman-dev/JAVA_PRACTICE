package DAY_18.JAVA_8_FEATURES.com.demo.beans;

public class Product {
	private String name;
	private double price;
	
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

    public static void productcode(Product p) {
    	System.out.println(p.name+"xxx");
    }
	public double getdiscount(double per) {
		return price*per;
	}
	public boolean isPremium() {
		return price>2000;
		
		
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}
