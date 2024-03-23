package Loop;

public class Stars {
	public static void main(String[] args) {
		int w=4;
		for(int h=w;h>0;h--) {
			for(int r=0;r<h;r++) {
				System.out.print("*");
			}
			//System.out.print("/n");
		}
	}
}
