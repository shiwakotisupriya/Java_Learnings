package loop;
import java.util.Scanner;
public class CurrencyConverter {
	public static void main(String[]args) {
		System.out.println("....Start.....");

		while(true) {
		System.out.println("Enter the amount: ");
		Scanner scan = new Scanner(System.in);
		double npr = scan.nextDouble();


		double USD = npr/127.83;
		double INR = npr/1.60;
		double GBP = npr/151.80;


		System.out.println("Enter a number 1 to convert NRP to USD.");
		System.out.println("Enter a number 2 to convert NRP to INR.");
		System.out.println("Enter a number 3 to convert NRP to GBP.");


		System.out.println("Enter a number : ");
		int no =scan.nextInt();

		if(no==1) {
		System.out.println("NPR  " + npr + "  is equal to USD  "+ USD + "." );
		}else if(no==2){
		System.out.println("NPR  " + npr + "  is equal to INR  "+ INR + "." );
		}else if(no==3) {
		System.out.println("NPR  " + npr + "  is equal to GBP  "+ GBP + "." );
		}else {
		System.out.println("The number can only be 1 ,2 and 3" );
		}
		System.out.println("Do you want to continue Yes/No");
		String choice = scan.next();
		if(choice.equals("yes")) {
		continue;
		}else {

		scan.close();
		System.out.println(".....End.....");
		break;
		}



		}



		 
		
	}
	
}
