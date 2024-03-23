package TCA;

public class Circle {
	protected double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return(radius);
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double area() {
		System.out.println( Math.PI*this.radius*this.radius);
		return radius;
	}
	
}
