package homework;

import java.util.Scanner;
public class Week3_Lab5 {

	public static void main(String[] args) {
		Scanner sec=new Scanner(System.in);
		int maxi=Integer.MIN_VALUE;
		int mini=Integer.MIN_VALUE;
		
		int tally=0;
		double add=0;
		System.out.println("*******If you type 'quit' I will stop*******");
		String enter = sec.next();
		while(enter !=("quit")) {
			add +=enter.length();	
			tally++;
			
			if (enter.length()>maxi) {
				maxi=enter.length();
			}
			if (enter.length()>mini) {
				mini=enter.length();
			}
			System.out.println("Enter a String. Type ’quit’ to quit.");
            enter = sec .nextLine();
		}
        System.out.println("Max string length: " + maxi);
        System.out.println("Min string length: " + mini);
        System.out.println("Mean string length: " + (add / tally)); 
        sec .close();


	}

}
