package DAY_18.ENUM_DEMO.com.demo.enums;

public enum Cofee {
	Large(500,350),medium(300,250),small(200,200);
	
	private int size;
	private double price;
	private Cofee(int size,double price) {
		System.out.println("in cofee constructor "+size+"---->"+price);
		this.price=price;
		this.size=size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
}
