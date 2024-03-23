package Array2d;

public class ColumnSwap {
	public static void main(String[] args) {
	int[][] matrixx = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
	
	int column1=0;
	int column2=1;
		columnSwaps(matrixx, column1,column2);
		
		for (int[] row : matrixx) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
	
	
	}

	private static void columnSwaps(int[][] matrixx, int column1, int column2) {
		for(int i=0; i<matrixx.length;i++) {
		int mrr= matrixx[i][column1];
		matrixx[i][column1]=matrixx[i][column2];
		matrixx[i][column2]=mrr;
		}
		
	}
}
