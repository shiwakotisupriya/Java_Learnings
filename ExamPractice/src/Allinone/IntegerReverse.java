/*
 * @ Author Supriya Shiwakoti
 * 13 September,2022
 * 
 * 
 */

package Allinone;
import java.util.Scanner;
public class IntegerReverse {
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter A Number: ");
	int etc = abc.nextInt();//number to reverse
	int yup=0;//reversed number
	while(etc!=0) {//condition for reversing number
		int remainder=etc%10;//calculating remainder by using modulus operator 
		yup=yup*10+remainder;//0*10 + remainder number
		etc=etc/10;//dividing the number by 10
	}
	System.out.println(yup);
	abc.close();
	}
}
