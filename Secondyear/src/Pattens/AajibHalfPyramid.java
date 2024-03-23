package Pattens;

public class AajibHalfPyramid {
	public static void main(String[] args) {
		int abc=5;
		int j,k;
		for(j=abc;j>=1;j--) {
			for(k=1;k<j;k++) {
				 System.out.print(" ");
			}
			for(k=0;k<=abc-j;k++) {
				System.out.print("*");
			}
			System.out.println( );
		}
	}

}
