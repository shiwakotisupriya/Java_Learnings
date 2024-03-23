package Allinone;

import java.util.Arrays;

public class BollenArray {
	 public static void main(String[] args) {
		int a[]= {4,6,2,1,9,};
	    int b[]= {4,6,0,1,9};
	    int c[]= {4,6,0,1,9};
	    System.out.println("array a and array b  "+ Arrays.equals(a,b));
	    System.out.println("array a and array c  "+ Arrays.equals(a,c));
	    System.out.println("array b and array c  "+ Arrays.equals(b,c));
	}// Array equals checks weather the two array are equal or not.
}
