package reverse;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner opt=new Scanner(System.in);
		System.out.println("Enter a number:::");
		int nmbr= opt.nextInt();
		int rvrs=0;
		while(nmbr!=0){
			int rm=nmbr%10;
			rvrs=rvrs*10+rm;
			nmbr=nmbr/10;
		}
		System.out.println(rvrs+" is the reverse of the given number");
		opt.close();
	}

	
}
