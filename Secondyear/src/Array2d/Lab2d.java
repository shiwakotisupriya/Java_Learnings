package Array2d;

public class Lab2d {
	public static void main(String[] args) {
		int are[][]=new int[3][3];
		
		are[0][0]=0;
		are[0][1]=1;
		are[0][2]=2;
		are[1][0]=3;
		are[1][1]=4;
		are[1][2]=5;
		are[2][0]=6;
		are[2][1]=7;
		are[2][2]=8;
		
		
		
//		enhanced for loop
		for(int[] i: are) { // for row
			for(int number :i ) { // for column
				System.out.print(number+"   ");
			}
			System.out.println(" ");
		}	
		
		
		
		
		
		
	}

}
