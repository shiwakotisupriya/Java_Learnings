  package Allinone;

public class MatrixSum {
	public static void main(String[] args) {
		int row=2,column=4;//number of row and column of matrix
		int f[][]= {{1 , 2, 3, 4},{5 ,6, 7,8}};//matrix 1
		int r[][]= {{10,12,13,14},{35,6,11,9}};//matrix 2
		
		// addition 
		int Add[][]=new int[row][column];
		for(int t=0; t< row;t++) {
			for(int u=0;u< column;u++) {
				Add[t][u]=f[t][u]+r[t][u];//t,u-loop f-first matrix  r-second matrix
			}
		}
		
		
		//printing the sum
		System.out.println("ADDITION OF THE  MATRIX IS");
		
		for(int[]rrr:Add) {// ternary operator : is used to assign the result of rrr to Add
			for(int clm:rrr) {
				System.out.print(clm+" ");
			}
			System.out.println();
		}
		
	}
	
}
