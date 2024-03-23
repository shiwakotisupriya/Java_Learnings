package Array2d;

public class MatrixTranspose {

	public static void main(String[] args) {
		int[][] hey= {{34,60,12},{82,93,24},{50,39,48},{67,76,45}};
		int k = 0;
		int l = 0;
		int [][]transpose_hey= new int[hey[0].length][hey.length];
		
		for( k=0; k<hey.length;k++) {
			for( l=0;l<hey[0].length;l++) {
				transpose_hey[l][k]= hey[k][l];
			}
		}
		
		
		for( k=0; k<transpose_hey.length;k++) {
			for( l=0;l<transpose_hey[0].length;l++) {
				System.out.print(transpose_hey[k][l]+" ");
			}
			System.out.println(" ");
		}
		
		
		
		

	}

}
