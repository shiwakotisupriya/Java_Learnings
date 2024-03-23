package methods;
import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		System.out.println("ENTER NUMBER");
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		oddEvenNumbers(number); //calling oddEvenNumbers Method
		num.close();//closing scanner
	}
	static void oddEvenNumbers(int number) {
		if (number % 2 == 0) {
			System.out.println(number+" IS EVEN NUMBER");
		}
		else {
			System.out.println(number+" IS ODD NUMBER");
		}
	}
}
