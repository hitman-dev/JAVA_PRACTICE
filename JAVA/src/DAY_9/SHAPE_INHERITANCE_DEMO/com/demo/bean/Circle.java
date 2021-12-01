package DAY_9.SHAPE_INHERITANCE_DEMO.com.demo.bean;

public class Circle extends Shape{
	private float radius;
	static final float pi=3.142f;

	public Circle() {
		super();
	}

	public Circle(String color,float radius) {
		super(color);
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
    
	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}

	@Override
	public float calculatePerimeter() {
		return 2*pi*radius;
	}

	@Override
	public float calculateArea() {
		return pi*radius*radius;
	}
	

}
