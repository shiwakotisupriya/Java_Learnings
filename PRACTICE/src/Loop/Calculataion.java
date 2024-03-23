package Loop;
import java.util.Scanner;
public class Calculataion {
	public static void main(String[] args) {
		System.out.println("Enter total bill amount:");	
		Scanner bill=new Scanner(System.in);
		int tt=bill.nextInt();
		double tip=0;
		System.out.println("Enter Service Quality");
		int qlty=bill.nextInt();
		if(qlty<=4) {
			tip=0;
		}
		else if(qlty<=7){
			tip=0.1*tt;
		}
		else if(qlty<=10) {
			tip=0.2*tt;
		}
		else {
			System.out.println("Please Give quality in between 0 to 10");	
		}
		double ta=tt+tip;
		bill.close();
		System.out.println("Bill Amount ="+tt);	
		System.out.println("Quality Ratings ="+qlty);
		System.out.println(" Total bill amount ="+ta);	
	}
	
}
