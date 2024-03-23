package inheritance;

public class Animals {
	//instance variables
	protected String name;
	protected int noOfLimbs;
	protected int maxAge;
	protected char gender;
	protected boolean isEndengered;
	
	
	public  Animals(String name, int noOfLimbs, int maxAge, char gender, boolean isEndengered){
		this.noOfLimbs=noOfLimbs;
		this.maxAge=maxAge;
		this.gender=gender;
		this.isEndengered=isEndengered;
		this.name=name;
	}
	
	void eat() {
		System.out.println("....animal  eating.....");
	}
	void walk() {
		System.out.println(".....animal walking...");
	}
	
	
	
	void showDetails() {
		System.out.println("Name="+name+" endengered="+isEndengered+" Gender="+gender+" no of limbs="+noOfLimbs+" Maximum Age="+maxAge);
	}
}
