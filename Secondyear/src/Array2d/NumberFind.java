package Array2d;

import java.util.*;

public class NumberFind {
	public static void main(String[] args) {
		Scanner mat= new Scanner (System.in);
		System.out.println("Enter length of row");
		int roo=mat.nextInt();
		
		System.out.println("Enter length of Column");	
		int col=mat.nextInt();
		
		
		int[][] mymatrix = new int [roo][col];
		
		System.out.println("Enter number");
		for(int q=0;q<roo;q++) {
			for (int r=0;r<col;r++) {
				mymatrix[q][r]=mat.nextInt();				
			}
			
		}
		System.out.println("Enter number to find");
		
		int p=mat.nextInt();
		for(int q=0;q<roo;q++) {
			for (int r=0;r<col;r++) {
				if(mymatrix[q][r]==p)	{
					System.out.println("("+roo+", "+col+")"+" Here is the Matrix:)");		
				}
				

			}
			
		}
			
		mat.close();
	}

}
	
	
	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter length of row");
//		int rows = sc.nextInt();
//		System.out.println("Enter length of Column");	
//		int cols = sc.nextInt();
//		int[][] numbers = new int[rows][cols];
//		System.out.println("Enter number");
//		//input
//		//rows
//		for(int i=0; i<rows; i++) {
//		//columns
//		for(int j=0; j<cols; j++) {
//		numbers[i][j] = sc.nextInt();
//		}
//		}
//		System.out.println("Enter number to find");
//		int x = sc.nextInt();
//		for(int i=0; i<rows; i++) {
//		for(int j=0; j<cols; j++) {
//		//compare with x
//		if(numbers[i][j] == x) {
//		System.out.println("x found at location (" + i + ", " + j +
//		")");
//		}
//		}
//		}
//		}
//}
