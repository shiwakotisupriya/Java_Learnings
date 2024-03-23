package loop;
import java.util.Scanner;
public class IntegerTest {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=s.nextInt();
		for(int i = 1;i <= 10; ++i) {
		System.out.println(a+"*"+i+"="+a*i );	
		}
		s.close();
	}
}
