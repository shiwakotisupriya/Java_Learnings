package poly;

public class Week4_Lab2 {
	public static void main(String[] args) {
		
		Car cariyo=new Car("Ymill", "Dspl4", "JYE 456");
		int p=0;
		while(p<12) {
			cariyo.accelerate();
			System.out.println("The car "+ (cariyo.getMake())+" is travelling at "
					+(cariyo.getSpeed()) + "MPH");
		}
		
	}

}
class Car{
	private String make;
	private String model;
	private String registration;
	private int speed;
	
	
	public Car( String make, String model, String registration) {
		speed=0;
		this.make=make;
		this.model=model;
		this.registration=registration;	
	}
	
	public void accelerate() {
		speed +=5;
	}
	
	public void brake () {
		speed -=10;
	}
	public int getSpeed() {
		return speed;
	}
	public String getMake() {
		return make;
	}
	
}
