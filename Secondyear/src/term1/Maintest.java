package term1;

public class Maintest {

	public static void main(String[] args) {
		Cylinder area=new Cylinder(2, 3);
		double pi=3.14;
		System.out.println("The area Of Cylinder = "+2*pi*area.getRadius()*area.getHeight()+2*pi*area.getRadius()*area.getRadius());

}
	
}
class Circle {
	protected double radius;
	
	public Circle (double radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		return 0;		
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
class Cylinder extends Circle{
	private double height;
	public Cylinder(double radius,double height) {
		super(radius);
		this.setHeight(height);
		
	}
	
	public double getArea() {
		return 0;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
	

}
