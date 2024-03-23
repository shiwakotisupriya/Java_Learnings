package Allinone;
import java.util.Scanner;
public class FactorialValue {
	public static void main(String args []) {
		Scanner factors = new Scanner(System.in);
		System.out.println("Enter Number");
		int y=factors.nextInt();
		int d=1;
		for(int i=1; i<=y;i++) {
			 d= d*i;
        }
	System.out.println("Factors="+d);
	factors.close();
	}
}
