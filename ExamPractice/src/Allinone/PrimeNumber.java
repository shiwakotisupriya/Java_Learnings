
/*
 * @Author Supriya
 */
package Allinone;

public class PrimeNumber {
	public static void main(String[] args) {
		int r=0;
		int flag=0;
		int y= 3;//number to calculate weather it is prime or not
		r=y/2;// divide the given number by 2
		if(y==0||y==1) {//if the number is 0 or 1 print it is not a prime number
			System.out.println(y  +" is not a prime");
		}
		else {
			for(int t=2;t<=r;t++) {//using loop starting from 2 and less or equal to r and increasing
				if(r%t==0) {//if the remainder of r and t is equals to 0 after dividing it is not prime
					System.out.println(y+"  is not prime ");
					flag=1;//Boolean condition false
					break;//loop break
				}			
			}
			if(flag==0) {//if boolean condition is true it is prime number
				System.out.println(y+" is prime");
			}
		}
	}
}
