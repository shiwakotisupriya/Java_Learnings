package array;

import java.util.Arrays;

public class ArrayMerge {
	public static void main(String[] args) {
//first array to merge
		int r[]= {1,2,3,4,5,7,8,9,0,4};
//second array to merge
		int w[]= {8,6,5,4,3,8};
//calculating length of the first array
		int y=r.length;
//calculating length of the second array
		int q=w.length;
//adding two array to merge it 
		int f=y+q;
//after adding creating the new array
		int u[]=new int [f];
//predefined array copy
		System.arraycopy(r,0,u,0,y);
		System.arraycopy(w,0,u,y,q);
//print the array after merge
		System.out.println(Arrays.toString(u));
		
		
	}
}
