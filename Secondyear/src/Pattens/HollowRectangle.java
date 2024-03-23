package Pattens;

import java.util.*;

public class HollowRectangle {
	public static void main(String[] args) {
		
		 Scanner user=new Scanner(System.in);
		 System.out.println("Enter a vartical length of star needed"); 
		 int out=user.nextInt(); // Vertical length of the pattern
		 System.out.println("Enter a horizontal length of star needed"); 
		 int middle=user.nextInt(); //horizontal length of the pattern
	 
		int q;
		int r;

//		outer loop in which we will print the vertical star needed or rows

		for (q = 1; q <= out; q++) {
//			inner loop which prints star horigentally or columns

			for (r = 1; r <= middle; r++) {

				if (q == 1 || r == 1 || q == out || r == middle) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		 user.close(); 

	}
}
