package inheritance;

public class Dog extends Animals {
	private String breed;
	
	public Dog(String name,int noOfLimbs, int maxAge, char gender, boolean isEndengered, String breed) {
		super(name,noOfLimbs,maxAge,gender,isEndengered);
		this.breed = breed;
	}
	//method
	void bark() {
		System.out.println("Dog Barking");
	}
	void showDetails() {
		System.out.println("Name="+name+" endengered="+isEndengered+" Gender="+gender+" no of limbs="+noOfLimbs+" Maximum Age="+maxAge+"  Breed="+breed);
	}
}
