package Allinone;

public class Factorjava {
	public static void main(String[] args) {
	isFactor();	//calling the method
		
	}
	static void isFactor() {
		//number whose factor is to be calculated
		int nmbr=8;
		//using for loop to print the factors
		int e;
		for(e=1;e<=nmbr;e++) {
			//giving condition to  find factors
			if(nmbr%e==0) {
				//printing the factor
				System.out.print(e+" ");
				
			}
			
		}
		System.out.println("  These are the factors of  "+nmbr);
			}
}
