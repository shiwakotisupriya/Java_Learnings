package inheritance;

public class Test {

	public static void main(String[] args) {
		int a=4;
		int b=8;
		
		Man m= new Man();
		m.display(5, 2);
		m.display(a, b);// to print the variable assigned in main method

	}

}
class Human{
	int a=10;
	int b=20;
	
}
class Man extends Human{
	//class level variables
	int a=100;
	int b=200;
	
	
	
	void display(int a, int b) {
		
		System.out.println(this.a+"   "+this.b);// to print class level variables
		System.out.println(super.a+"   "+super.b);// to print parent variables
		
		
		System.out.println(a +"  "+b);//to print the variables which is assigned after creating object
		
	}
}
