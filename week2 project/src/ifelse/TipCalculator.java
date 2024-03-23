package ifelse;
import java.util.Scanner;
public class TipCalculator {
	public static void main(String[]args) {
		int ba;  
		int qos;
		System.out.println("Enter bill amount");
		Scanner t= new Scanner(System.in);
		ba =t.nextInt();
		double tip=0;
		System.out.println("Enter quality of service");
		qos=t.nextInt();
		if(qos<=4) {
			tip=0;
			}
		else if(qos<=7) {
			tip=0.05*ba;
			}
		else if(qos<=10) {
			tip=0.1*ba;
			}
		else {
			System.out.println("qos can only be between 0 to 10");
		}
			double totalAmount=ba+tip;
			t.close();
			System.out.println("BillAmount"+ba);
			System.out.println("TipAmount"+tip);
			System.out.println("TotalAmount"+totalAmount);
				
		}
}
