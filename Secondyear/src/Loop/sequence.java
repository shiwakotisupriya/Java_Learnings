package Loop;
//Write a program to print out all Armstrong numbers between 1 and 500. 
//If sum of cubes of each digit of the number is equal to the number itself,
//then the number is called an Armstrong number.
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

public class sequence {
	public static void main(String[] args) {
		int dig1;
		int dig2;
		int dig3;
		for(int nmbr=1; nmbr<=500;nmbr++) {
			int nrrr=nmbr;
			dig1=nrrr%10;
			
			nrrr=nrrr/10;
			dig2=nrrr%10;
			
			nrrr=nrrr/10;
			dig3=nrrr%10;
			
			
			
			if(dig1*dig1*dig1+dig2*dig2*dig2+dig3*dig3*dig3==nmbr) {
				System.out.println(nmbr);
			}
			
			
		}
		
	}
}
