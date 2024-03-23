package Allinone;
import java.util.Scanner;
public class BetweenSwitchAge {
	public static void main(String[] args) {
	System.out.println("Enter your age");
	Scanner t= new Scanner(System.in);
	int age=t.nextInt();
	switch (age) {
	case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:
		System.out.println("Your age is in between 0 to 10");
		break;
	case 11:case 12:case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:
		System.out.println("Your age is in between 10 to 20");
		break;
	case 21:case 22:case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:
		System.out.println("Your age is in between 20 to 30");
		break;
	case 31:case 32:case 33:case 34:case 35:case 36:case 37:case 38:case 39:case 40:
		System.out.println("Your age is in between 30 to 40");
		break;
		
		default:
			System.out.println("You age is above 40");
	
	
	
	}
	
	t.close();
	}

}
