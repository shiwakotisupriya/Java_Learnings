package reverse;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		String ori,rev="";
		Scanner https=new Scanner(System.in);
		System.out.println("Enter a string");
		ori=https.next();
		int length= ori.length();
		for(int t=length-1; t>=0;t--) {
			rev=rev+ori.charAt(t);
		}
			System.out.println("reverse of word is: "+rev);
		
		https.close();
	}
}
