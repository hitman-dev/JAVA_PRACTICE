package DAY_27_JDBC_ASSIGNMENT.Q3_Reflection_Assignment.com.demo.beans;

public abstract class Shape {
	private String color;

	public Shape() {
		super();
		color="red";
	}

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public abstract float calculatePerimeter();
	public abstract float calculateArea();
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	

}
