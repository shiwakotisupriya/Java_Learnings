package Array;

public class Maximum {
	public static void main(String[] args) {
		int ary[]= {9,5,3};
		int max=0;
		int min=0;
		for(int a=0; a<ary.length; a++) {
			if(ary[a]>max)
				max=ary[a];
			else if(ary[a]<max) 
				min=ary[a];
			
			
		}
	System.out.println(max);
	System.out.println(min);
	}
}
