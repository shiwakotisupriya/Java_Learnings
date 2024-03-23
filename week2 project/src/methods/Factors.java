package methods;
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		System.out.println("Enter Number");
		
		Scanner fac = new Scanner(System.in);
		int y=fac.nextInt();
		factors(y);
		fac.close();
	}
	static void factors(int y) {
		
		int d=1;
		for(int i=1; i<=y;i++) {
			 d= d*i;
        }
		System.out.println("Factors="+d);
	}
	
}
