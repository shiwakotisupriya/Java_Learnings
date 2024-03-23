package Allinone;

public class LargestAndSmallestArray {
	public static void main(String[] args) {
		int rere[]= {12,45,67,89};
		
		int lrg= rere[0];
		int sml=rere[0];
		
		for(int r=1;r<rere.length;r++) {
			if(rere[r]>lrg) {
				lrg=rere[r];
			}
			else if(rere[r]<sml) {
				sml=rere [r];
			}
		}
		System.out.println("Largest "+lrg);
		System.out.println("smallest "+sml);
	}
}
