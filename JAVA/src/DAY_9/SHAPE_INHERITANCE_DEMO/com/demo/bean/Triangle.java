package DAY_9.SHAPE_INHERITANCE_DEMO.com.demo.bean;

public class Triangle extends Shape{
	private float base,height,side1,side2;

	public Triangle() {
		super();
	}

	public Triangle(String color,float base, float height, float side1, float side2) {
		super(color);
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getSide1() {
		return side1;
	}

	public void setSide1(float side1) {
		this.side1 = side1;
	}

	public float getSide2() {
		return side2;
	}

	public void setSide2(float side2) {
		this.side2 = side2;
	}
	
	public float calculatePerimeter() {
		return side1+side2+base;
	}
	
	public float calculateArea() {
		return 0.5f*height*base;
	}
	public void m1() {
		System.out.println("in traingle m1");
	}

	@Override
	public String toString() {
		return super.toString()+"Triangle [base=" + base + ", height=" + height + ", side1=" + side1 + ", side2=" + side2 + "]";
	}
	

}
