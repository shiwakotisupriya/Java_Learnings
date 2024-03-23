package loop;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[]args) {
		Scanner uu= new Scanner(System.in);
		while(true) {
		System.out.print("Enter number ");
		int a =uu.nextInt();

        if(a % 2 == 0){
            System.out.println(a + " is even");
            }
        else {
            System.out.println(a + " is odd");
           }
        System.out.println("Do you want to continue");
        char choice = uu.next().charAt(0);
        if(choice=='y') {continue;}
        else {
        	System.out.println("....Existing....");	
        	break;
        }
		}
		uu.close();
	}
}
