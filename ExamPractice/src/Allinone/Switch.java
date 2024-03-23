package Allinone;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner a= new Scanner(System.in);
		int age=a.nextInt();
		
		switch(age) {
			case 18:
				System.out.println("You are beautiful");
				break;
			case 25:
				System.out.println("You Can Make Your Own decision ");
				break;
			case 35:
				System.out.println("You can have whatever you desire");
				break;
			case 45:
				System.out.println("You will go for a holiday trip ");
				break;
			default:
				System.out.println("You are the very good human being");
		}
		
		
		a.close();
		
		}
}
