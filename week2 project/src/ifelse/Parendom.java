package ifelse;
import java.util.Scanner;
public class Parendom {
	public static void main(String[]arg) {
		Scanner gh=new Scanner(System.in);
		System.out.println("Enter number");
		String orginal,reverse="";
		orginal=gh.nextLine();
		int length=orginal.length();
		for(int e=length-1;e>=0;e--) 
			reverse= reverse+ orginal.charAt(e);
			if(orginal.equals(reverse)) {
			System.out.println("It is palandrom");	
			}
			else {
				System.out.println("It is not palandrom");	
			}
		}
		
	}

