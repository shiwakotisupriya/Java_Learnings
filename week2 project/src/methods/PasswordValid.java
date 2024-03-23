package methods;
import java.util.Scanner;
public class PasswordValid {
	public static void main(String[] args) {
		//minimum capital letters to be use
		int capNum=3;
		//minimum small letter to be uses
		int smlNum=4;
		//minimum number digit
		int dgt= 2;
		//
		
		int dC=0;// digit count
		int lwC=0;//lower case count
		int uC=0;//upper case count
		System.out.println("Enter Your  password:");
		Scanner lclc=new Scanner(System.in);//creating scanner object to take input from user
		String pspd=lclc.nextLine();
		//using for loop
		for(int e=0;e<pspd.length();e++) {
			char q=pspd.charAt(e);
			if(Character.isUpperCase(q)) {
				uC++;}
			else if(Character.isLowerCase(q)) {
					lwC++;
				}
			else if(Character.isDigit(q)) {
				dC++;
			}
		}
		//conditions for valid password	
			if(uC >= capNum && lwC >= smlNum&& dC >= dgt) {
				System.out.println(" Good!! "
						+ "You Have  Entered A Valid Password");
			}
			
			//conditions for invalid password
			else {
				System.out.println("Password lacks the following things:");
				if(uC < capNum) {//if no of capital number is not equal to uC
					System.out.println("Capital number");
				}
				if(lwC < smlNum) {//if no of small number is not equal to sC
					System.out.println("Small number");
				}
				if(dC < dgt) {//if no of digit count is not equal to dC
					System.out.println("Digits");
				}
			}
			lclc.close();
		}
		
}
