package inheritance;

public class SimpleInheritance {
	public static void main(String[] args) {
		Nepal pre= new Nepal();
		pre.protection();
		System.out.println("Name is " +pre.name);
	}

}

class Country{
	String name = "Nepal";
	int populations =300000000;
	float area=4261782.2671f;
	
	void protection() {
		System.out.println("Every nation provides security");
	}
	
}
class Nepal extends Country{
	
	String name = "President";
	void protection() {
		System.out.println("I will protect my Land");
	}
}



