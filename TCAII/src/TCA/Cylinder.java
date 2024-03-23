package TCA;
public class Cylinder extends Circle {
	private double height;
	
	public Cylinder(double radius,double height) {
		super(radius);
		this.height=height;
		
	}
	
	public double getHeight() {
		return(height);
	}
	public void setHeight (double height ) {
		this.height=height;
	}
	
	public double  area() {
		System.out.println(Math.PI*2*this.radius*this.radius+Math.PI*2*this.radius*this.height);
		return height;
		
		}
	
	
    
	
	
	
}
