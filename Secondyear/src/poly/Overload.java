package poly;

public class Overload {
	public static void main(String[] args) {
		Calculation calc=new Calculation();
		calc.sum(10, 20);
		calc.sum(20, 10.5);
		calc.sum(10, 20, 30, 40);
		
	}

}
class Calculation {
	void sum(int a,double d) {
		System.out.println("Sum is: "+(a+d));
	}
	void sum(int a,int b,int c) {
		System.out.println("Sum is: "+(a+b));
	}
	void sum(int a,int b,int c, int d) {
		System.out.println("Sum is: "+(a+b+c+d));
	}
	void sum(int a,float b) {
		System.out.println("Sum is: "+(b+a));
	}
	
	
	
}
