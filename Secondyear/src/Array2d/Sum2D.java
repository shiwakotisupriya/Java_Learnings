package Array2d;

public class Sum2D {

	public static void main(String[] args) {
		int[][] hey= {{34,60,12},{82,93,24},{50,39,48},{67,76,45}};
		
		System.out.println("                  Add Row                        ");
		//sum of row
		for(int[]q : hey) {
			int add = 0;
			for(int r :q) {
			 add += r;
				
			}
			System.out.println("Sum of the Row = "+ add);
		}
		
		System.out.println("                  Add Column                        ");
		
		//sum of column
		for(int p=0;p<3;p++) {
			int coladd=0;
			for(int w=0;w<4;w++) {
				coladd +=hey[w][p];
				
				}
			System.out.println("Sum of the Column ="+ coladd);
		}
		System.out.println("                      Maximum Row                                  ");
		
		//for calculating maximum in each row
		for(int b=0;b<hey.length;b++) {
			int value = hey[b][0];// Assume the first element is the maximum in the row
			for(int d=0;d<hey[b].length; d++) {
				if(hey[b][d]>value) {
					value=hey[b][d];
				}
			}
			System.out.println("Maximum value in row="+value);
			
		}
		
		
		System.out.println("                      Minimum Row                                  ");
		
		//for calculating minimum in each row
		for(int b=0;b<hey.length;b++) {
			int value = hey[b][0];// Assume the first element is the minimum in the row
			for(int d=0;d<hey[b].length; d++) {
				if(hey[b][d]<value) {
					value=hey[b][d];
				}
			}
			System.out.println("Minimum value in row="+value);
			
		}
		
		
		
		System.out.println("                     Maximum Column                                  ");
		
		//for calculating maximum in each column
		for(int b=0;b<hey[0].length;b++) {
			int value = hey[0][b];// Assume the first element is the maximum in the row
			for(int d=0;d<hey.length; d++) {
				if(hey[d][b]>value) {
					value=hey[d][b];
				}
			}
			System.out.println("Maximum value in column ="+value);
			
		}
		System.out.println("                      Minimum Column                                  ");
		
		//for calculating maximum in each column
				for(int b=0;b<hey[0].length;b++) {
					int value = hey[0][b];// Assume the first element is the maximum in the row
					for(int d=0;d<hey.length; d++) {
						if(hey[d][b]<value) {
							value=hey[d][b];
						}
					}
					System.out.println("Minimum value in column ="+value);
					
				}
		
		

	}

}
