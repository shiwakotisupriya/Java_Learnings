package term1;

public class Allinter {

	public static void main(String[] args) {
		
		
		Fountain_Pen fn = new Fountain_Pen();
		fn.write();
		fn.refill();
		fn.change_nib();
		
		
		System.out.println("______________________________________________");
		
		
		Human hm=new Human();
		hm.eat();
		hm.bite();
		hm.jump();
		hm.sleep();
		
		System.out.println("______________________________________________");
		
		Smart_telephone st=new Smart_telephone();
		st.lift();
		st.with();
		st.disconnect();
		
		System.out.println("______________________________________________");
		
		
		TV tv= new TV();
		tv.smart();
		tv.tv();
		
		
		

	}

}




abstract class Pen{
	abstract void write();
	abstract void refill();
	
}

class Fountain_Pen extends Pen{

	void write() {
		System.out.println("Write with Pen");
		
	}
	void refill() {
		System.out.println("Refil the Ink in a pen");
		
	}
	void change_nib() {
		System.out.println("change the nib of the old pen");
	}
	
}






class Monkey{
	void jump() {
		System.out.println("Monkey jumps from one branch to another");
	}
	
	void bite() {
		System.out.println("If you tease, It bites You");
	}
}


interface Basic_animal{
	public void eat();
	public void sleep();
}


class Human extends Monkey implements Basic_animal{
	
	
	public void eat() {
		
		System.out.println("Humans are foodie.");
	}

	public void sleep() {
		System.out.println("Humans are lazy,they loves sleeping all the day");
		
	}
	
}




abstract class Telephone{
	abstract void with();
	abstract void lift();
	abstract void disconnect();
}
class  Smart_telephone extends Telephone{

	
	void with() {
		
		System.out.println("Call with Supriya :)");
	}

	
	void lift() {
		
		System.out.println("Lift it");
	}

	
	void disconnect() {
		System.out.println("Disconnected!!");
		
	}
	
}
interface SmartRemote{
	public void smart(); 
}
interface Tvremote extends SmartRemote{
	
	public void tv();
	
}

class TV implements Tvremote{

	
	public void smart() {
		System.out.println("I am smart Remote");
		
	}

	
	public void tv() {
		System.out.println("I am TV remote");
		
	}
	
}

