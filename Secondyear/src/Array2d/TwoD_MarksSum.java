package Array2d;

public class TwoD_MarksSum {

	public static void main(String[] args) {
		int [][]obtain=new int[3][3];
		
		obtain[0][0]=20;
		obtain[0][1]=40;
		obtain[0][2]=48;
		
		obtain[1][0]=50;
		obtain[1][1]=48;
		obtain[1][2]=49;
		
		obtain[2][0]=40;
		obtain[2][1]=40;
		obtain[2][2]=48;
		
		
		for (int[] q :obtain) {
			int t=0;
			for(int er:q) {
				t +=er;
			}
			System.out.println("Marks obtained by each person="+t);
		}

	}

}
