package ifelse;
import java.util.Scanner;
public class Age {
	public static void main(String[]args) {
		Scanner yy=new Scanner(System.in);
		System.out.println("Age of person one");
		int first=yy.nextInt();
		System.out.println("Age of person two");
		int second=yy.nextInt();
		System.out.println("Age of person three");
		int third=yy.nextInt();
		if(first>second&&first>third) {
			System.out.println("  first person is elder");
		}
		else if(second>first&&second>third) {
			System.out.println(" second person is elder");
		}
		else if(third>second&&third>first) {
			System.out.println(" third person is elder");
		}
		else {
			System.out.println("Age of all person are equal");
		}
		if(first<second&&first<third) {
			System.out.println(" first person is young");
		}
		else if(second<first&&second<third) {
			System.out.println("second person is young");
		}
		else if(third<second&&third<first) {
			System.out.println("third person is young");
		}
		
		
	}
}
