package Allinone;
import java.util.Scanner;
public class DaySwich {
	public static void main(String[] args) {
		System.out.println("Type your favourit number from 1 to 7 to get your lucky day");
		Scanner d=new Scanner(System.in);
		int day= d.nextInt();
		switch (day) {
		case 1:
			System.out.println("Wednesday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Saturday");
			break;
		case 4:
			System.out.println("Sunday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Tuesday");
			break;
		case 7:
			System.out.println("Friday");
			break;
		default:
			System.out.println("I told you to choose number from 1 to 7");
		}
		d.close();
	}


}
