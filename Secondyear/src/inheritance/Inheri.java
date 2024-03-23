package inheritance;

public class Inheri {

	public static void main(String[] args) {
		Father father = new Father();
		father.eat();
		father.earn();
		System.out.println("Saving is "+ father.saving);
		
		Grandchild gg = new Grandchild();
		System.out.println("I have Rs " + gg.money);
		gg.eat();
		gg.spend();
		

	}

}
class Father{
	float saving=1000;
	void eat() {
		
		System.out.println("Every  father eats food.");
	}
	void earn() {
		System.out.println("Father earns for their kid.");
	}
}
class Sister extends Father {
	void eat() {
		System.out.println("Kids eats what their parents gives them.");
	}
	void spend() {
		System.out.println("Kid spends parents money.");
	}
}
class Grandchild extends Sister {
	int money=12345;
	 void intro() {
		 System.out.println("I am grandchild of my mothers father");
	 }
	
	
}

