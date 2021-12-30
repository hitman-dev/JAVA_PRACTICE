package DAY_27_JDBC_ASSIGNMENT.Q3_Reflection_Assignment.com.demo.beans;

public class Rectangle extends Shape{
	private float length;
	private float breadth;

	public Rectangle() {
		super();
	}

	public Rectangle(String color, float length,float breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle{" +
				"length=" + length +
				", breadth=" + breadth +
				'}';
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public float calculatePerimeter() {
		return 2*(length + breadth);
	}

	@Override
	public float calculateArea() {
		return length * breadth;
	}
	

}
