package AbstractionAndInterface;

public class Mobile {

	public static void main(String[] args) {
		Oppo o=new Oppo();
		o.keypad();
		o.radio();
		o.games();
		o.torch();
		
		
		System.out.println("***IPHONE***");
		
		
		
		IPhone i=new IPhone();
		i.keypad();
		i.radio();
		i.games();
		i.camera();
		
		
		System.out.println("***SAMGSUNG***");
		
		Samsung s=new Samsung();
		s.keypad();
		s.radio();
		s.games();
		s.parentscontrol();
		
		
	}

}




abstract class MobilePhone {
	int size;
	float price;
	String color;
	
	abstract void keypad();//abstract method
	abstract void radio();
	abstract void games();
	
	void cellularCall() {//we can write abstract method as well as normal method inside abstract class
		//Any functionality of your choicer
	}

}
class Oppo extends MobilePhone{
	void keypad() {
		System.out.println("All Oppo varients are touch basd keypad");
	}
	void radio(){
		System.out.println("Radios are built on app based");
	}
	void games() {
		System.out.println("Games are advanced with GUI and Graphic cards");
	}
	void torch() {
		System.out.println("High Raid torches");
	}
}
class IPhone extends MobilePhone{

	void keypad() {
		System.out.println("All Iphone varients are touch based keypad");
	}
	void radio(){
		System.out.println("Radios are built on app basedon iphone");
	}
	void games() {
		System.out.println("Games are advanced with GUI and Graphic cards");
	}
	void camera() {
		System.out.println("High picture quality camera");
	}
	
}
class Samsung extends MobilePhone{

	void keypad() {
		System.out.println("All samsung varients are touch basd keypad");
	}
	void radio(){
		System.out.println("Radios are built on app based");
	}
	void games() {
		System.out.println("Games are advanced with GUI and Graphic cards");
	}
	void parentscontrol() {
		System.out.println("Parents can control how mush time child can use mobile");
	
	}
	
}