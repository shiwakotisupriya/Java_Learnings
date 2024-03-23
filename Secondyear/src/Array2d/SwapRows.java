package Array2d;

public class SwapRows {

	public static void main(String[] args) {
		int[][] matrixx = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		
		int row2=1;
		int row3=2;
		
		
		
		rowSwap(matrixx, row2, row3);
		//enhanced for loop
		for (int[] row : matrixx) {
		    for (int element : row) {
		        System.out.print(element + " ");
		    }
		    System.out.println();
		}

		
		//normal for loop 
		
		/*for(int e=0;e<matrixx.length;e++) {
			for(int f=0;f<matrixx[e].length;f++) {
				
				System.out.print(matrixx[e][f]+" ");
			}
			System.out.println();
		}*/

	}

	 static void rowSwap(int[][] matrixx, int row2, int row3) {
		int[] trr = matrixx[row2];
		matrixx[row2] = matrixx[row3];
		matrixx[row3]=trr;
		
	}
	 
	 

}
