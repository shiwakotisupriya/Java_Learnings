package javaPricticeTCAII;
import java.io.*;
import java.util.*;
public class FileHandel {
	public static void main(String[] args) {
//		creating file
		File f = new File("texts.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("Your file has created sucessfully");
			}
			else {
				System.out.println("Failed while creating");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
//		writing inside file
		try {
			FileWriter fw = new FileWriter("texts.txt");
			fw.write("Hey its a warning for you that i am gonna kill you very Soon");
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
//		reading file
		try {
			Scanner sc = new Scanner (f);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
//		deleting file
		if (f.delete()) {
			System.out.println("File deleted sucessfully");
		}
		else {
			System.out.println("Failed while deleting");
		}
	}
	
}
