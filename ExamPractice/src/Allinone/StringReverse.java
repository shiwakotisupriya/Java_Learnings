package Allinone;
import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		System.out.println("Enter a word");
		Scanner t=new Scanner(System.in);
		String word=t.nextLine();//original word
		int r=word.length();//calculating length of string
		String drow = "";//reverse word
		//applying loop for reversing word
		for(int e=r-1;e>=0;e-- ) {
			drow= drow+word.charAt(e);
		}
		System.out.println(drow+" This is the reverse word of "+word);
		t.close();
	}
}
