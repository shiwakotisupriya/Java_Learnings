package term1;

public class IntFace {

	public static void main(String[] args) {
		Fish fry = new Fish();
		
		System.out.println("Fish Has "+ fry.Number_of_legs()+" legs");
	}

}

interface Animal{
	public int Number_of_legs();
	
}
class Fish implements Animal{
	public int Number_of_legs() {
		return 0;
	}
	
}
