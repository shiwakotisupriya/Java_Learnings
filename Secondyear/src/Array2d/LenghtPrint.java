package Array2d;

public class LenghtPrint {

	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9},
	            {6, 3, 9}
	        };

	        int rows = matrix.length;
	        int columns = matrix[0].length;

	        System.out.println("Number of rows: " + rows);
	        System.out.println("Number of columns: " + columns);

	}

}
