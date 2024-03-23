package Loop;
import java.util.Scanner;
public class loopex {
	public static void main(String[] args) {
//		Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
		
			Scanner por=new Scanner(System.in);
			System.out.println("Enter Base Number:");
			int base=por.nextInt();
			System.out.println("Enter Power:");
			int power=por.nextInt();
			int output=1;
			for(int e=1;e<=power;e++) {
				output *=base;
			}
		System.out.println("Final output:"+" "+ output);
		por.close();
	}

}
