package Allinone;
import java.util.Scanner;
public class Password {
	public static void main(String[] args) { 
		int caps=3;
		int smls=3;
		int dgs=3;
		
		
		int c=0;
		int s=0;
		int d=0;
		
		
		System.out.println("Enter A Strong Password For A system:");
		Scanner ye=new Scanner(System.in);
		String Password= ye.nextLine();
		int r;
		for(r=0;r<Password.length();r++) {
			char e=Password.charAt(r);
			if(Character.isLowerCase(e)) {
				s++;
			}
			else if(Character.isUpperCase(e)) {
				c++;
			}
			else if(Character.isDigit(e)) {
				d++;
			}
		}
		
		
			if(c>=caps && s>=smls && d>=dgs) {
				System.out.println("........The password you have entered is strong and valid....... "
						+ "Thankyou!!");
				
			}
			
			 	
			else {
				System.out.println("!!!!!INVALID!!!!!");
				
				if(c < caps){
					System.out.println("Enter more than three capital letter");
				}
			   if(s < smls) {
					System.out.println("Enter more than three small letter");
				}
			    if(d < dgs) {
					System.out.println("Enter more than three Digits");
				}
				
			   
			}
			ye.close();
	}
	
}
