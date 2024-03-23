package TCA;
import java.util.Scanner;
public class extension {
	public static void main(String[] args) {
		String []name= new String[] {"Ron","Jo","Sally","Jim","Edward","Reception"};
		Scanner ex=new Scanner(System.in);
		System.out.println(" Enter phone extension number");
		int e= ex.nextInt();
		if (e==0) {
			System.out.println(name[0]);
		}
		else if (e==1) {
			System.out.println(name[1]);
		}
		else if (e==2) {
			System.out.println(name[2]);
		}
		else if (e==3) {
			System.out.println(name[3]);
		}
		else if (e==4) {
			System.out.println(name[4]);
		}
		else if (e==5) {
			System.out.println(name[5]);
		}
		else {
			System.out.println("Phone extension number doesnot exist");
		}
		
	ex.close();	
		}
	
}

