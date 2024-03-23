package Loop;
import java.util.Scanner;
public class loop {
	public static void main (String[]args) {
		//printing 1to 10
		for(int r=1; r<=10;r++) {
			System.out.println(r);
		}
		
		System.out.println("  ");
		
		
//		printing 0 to 20
		int i;
		for (i=0;i<=20;i++) {
			System.out.println(i);
			}
		
		System.out.println("  ");
		
	
//		printing 10 to 0
		int y;
		for(y=10;y>=0;y--) {
			System.out.println(y);
		}
		
		System.out.println("  ");
		
		
		
//		sum of 1st 10  natural numbers 
		int add=0;
		int p;
		for (p=0;p<=10;p++) {
			add +=p;
			
		}
		System.out.println("Addition="+ add);
		
		System.out.println("  ");
		
		
		
//		Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int ops=scan.nextInt();
		 for(int u=1;u<=15;u++) {
			 System.out.println(ops+"*"+u+"="+(ops*u));
		 }
		scan.close();
	}
	
		
		
	}


