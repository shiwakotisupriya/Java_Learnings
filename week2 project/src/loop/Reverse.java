package loop;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner y=new Scanner(System.in);
		System.out.println("Enter a string");		
		String oring=y.next();
		String rev = "";
		System.out.println("Without reverse "+oring);
		for( int r=oring.length()-1; r>=0; --r) {
			char hi=oring.charAt(r);
			rev = rev+ hi;
			
			
		}
		
		System.out.print("Reversed: " + rev);
		y.close();
		
	}
	
}
