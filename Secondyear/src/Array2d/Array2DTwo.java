package Array2d;

public class Array2DTwo {

	public static void main(String[] args) {
		String are[][]=new String[4][2];
		are[0][0]="Aayana";
		are[0][1]="one";
		are[1][0]="Priya";
		are[1][1]="Two";
		are[2][0]="Erica";
		are[2][1]="Three";
		are[3][0]="Hynana";
		are[3][1]="Four";
		
		
		// outer loop for row
		for(int m=0; m<are.length;m++) {
			//inner loop for column
			for(int n=0;n<are[m].length; n++) {
				System.out.print("\t"+are[m][n]);
				
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
