/*
*
*@Author Supriya Shiwakoti 
*September,13 2022
*
*/

package Allinone;
import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		//Asking user to enter a number
		System.out.println("Enter a number to  find odd or even");
	//creating a scanner object
		Scanner wp=new Scanner(System.in);
		int epe=wp.nextInt();
		//condition for  even
		if(epe%2==0){
			System.out.println(epe+"  Is Even");
		}
		//condition for odd
		else {
			System.out.println(epe+"  Is Odd");
		}
		//closing scanner
		wp.close();
	}
	
}
