package homework;
import java.util.Scanner;
public class MiniProject {
	public static void main(String[] args) {
		Scanner mini=new Scanner(System.in);
		System.out.println("Enter your yearly income:");
		int input=mini.nextInt();
		
		if(input<=500000) {
			int tax;
			tax=(int) (0.01*input);
			
			System.out.println("You need to pay Rs."+ tax+" as a tax");
		}
		else if(500000<input&& input<700000) {
			int amt;
			amt=(int) (0.1*input);
			System.out.println("You need to pay Rs."+ amt+" as a tax");
		}
		else if(700000<input&& input<900000) {
			int taxation;
			taxation=(int) (0.2*input);
			System.out.println("You need to pay Rs."+ taxation+" as a tax");
		}
		else if(900000<input&& input<1200000) {
			int amount;
			amount=(int) (0.3*input);
			System.out.println("You need to pay Rs."+amount+"as a tax");
		}
		else if(input>1200000) {
			int maxTax;
			maxTax=(int) (0.35*input);
			System.out.println("You need to pay Rs."+maxTax+" as a tax");
		}
		
		else {
			System.out.println("Please enter your annual income");
		}
		mini.close();
		
	}
}
