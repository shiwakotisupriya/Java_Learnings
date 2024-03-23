package ifelse;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[]args) {
		Scanner uu= new Scanner(System.in);
		System.out.print("Enter number ");
		int a =uu.nextInt();

        if(a % 2 == 0){
            System.out.println(a + " is even");
            }
        else {
            System.out.println(a + " is odd");
           }
		
	}
}
