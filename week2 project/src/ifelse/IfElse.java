package ifelse;
import java.util.Scanner;
public class IfElse {
	public static void main(String[]args) {	
		Scanner p= new Scanner(System.in);
		System.out.println("Enter length");
	    double length= p.nextDouble();
		System.out.println("Enter bredth");
		double bredth= p.nextDouble();
		if(length==bredth) {
			System.out.println("its square");
			}
		else {
			System.out.println("its rectangle");
		}
		
		if(length>bredth) {
			System.out.println(length+"is greater");
			}
		else {
			System.out.println(bredth+"is greater");
		}
		
		int year;  //total years of service
		int sal;  //variable to store salary
		
		double d; //variable to calculate gross salary
		System.out.println("Enter total years of services");
		Scanner t= new Scanner(System.in);
		year=t.nextInt();
		
		
		
		if(year>5)
		{
			System.out.println("please enter your salary");
			sal=t.nextInt();
			System.out.println("your salary is >"+sal);
			System.out.println("your 5% bonous is >"+sal*0.05);
			System.out.println("your net bonous with salary is >"+(sal+(sal*0.05)));
		}
		else {
			System.out.println("no bonous");
		}
		
		
	}
}
