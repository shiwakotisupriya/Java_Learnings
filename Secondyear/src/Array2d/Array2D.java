package Array2d;

public class Array2D{
	public static void main(String[] args) {
		int arr[][]=null; //array declaration
		arr=new int[3][2];
		
//		int arr2[][]=null;
//		arr2 = new int [2][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		arr[2][0]=50;
		arr[2][1]=60;
		
		// outer loop for row
		for(int i=0; i<arr.length;i++) {
			//inner loop for column
			for(int j=0;j<arr[i].length; j++) {
				System.out.print("\t"+arr[i][j]);
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		/*
		 * System.out.println("Length of arr = "+arr.length);//always takes length of
		 * first array System.out.println("Length of arr2 = "+arr2.length);
		 * System.out.println("Length = "+ arr[0].length);//array works as a matrix
		 * System.out.println("Length = "+ arr[1].length);
		 * System.out.println("Length = "+ arr[2].length);
		 */
		
	}	
	
	

}
