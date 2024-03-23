package Array;

public class SumArray {
	public static void main(String[] args) {
		int ay[]= {0,9,8,7,6,5,4,3,2,1};
		int  add=0;
		for (int t=0;t<ay.length;t++) {
			add=add+ay[t];
		}
	System.out.println("Sum="+add);//to calculate sum of the given array
	
		
		
		
		//to calculate average of the given sum
		
		double avg=add/ay.length;
		System.out.println("Average="+avg);
	}
}
