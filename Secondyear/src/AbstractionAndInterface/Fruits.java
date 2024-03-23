package AbstractionAndInterface;

public class Fruits {
	public static void main(String[] args) {
		
		Consumer c= new Consumer();
		c.drinks();
		c.eat();
		c.juice();
		c.pickles();
		
	}
}



interface Mango{
	public void eat();
	public void juice();
	public void drinks();
	public void pickles();
} 

class Consumer implements Mango{
	public void eat() {
		System.out.println("I like eating Mangoes");
	}
	public void juice() {
		System.out.println("Mango juice is tasty");
	}
	public void drinks() {
		System.out.println("Priyancy likes drinking mango juice");
		
	}
	public void pickles() {
		System.out.println("i like mango pickles");
	
}

}




// we cannot make object of class which donot have all the methods of abstract class or interface 
// if we donot implement all the methods in a class then we should implement in derive class 
