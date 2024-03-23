package loop;
import java.util.Scanner;
public class DifferentAge {
	public static void main(String[]args) {
		Scanner on= new Scanner(System.in);
		System.out.println("Enter Age");
		int a=on.nextInt();
		if(a<=12&&a>0) {
		System.out.println("Child");
		}
		else if(a>=13&&a<=19) {
		System.out.println("Teen");
		}
		else if(a>=20&&a<=50) {
		System.out.println("Youth");
		}
		else if(a>=51&&a<=65) {
		System.out.println("Old");
		}
		else if(a>65&&a<110){
		System.out.println("Eldery");
		}                
		else {                                                               
		System.out.println("Age Entered In wrong Way");                         
		}                                                                    
		on.close();                                                                             
	}                                  
}                                                                                                                 
