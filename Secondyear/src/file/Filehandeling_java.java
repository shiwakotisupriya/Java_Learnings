package file;
import java.io.*;
import java.util.*;
public class Filehandeling_java {

	public static void main(String[] args) {
		
//		 creating a file
		
		File files = new File("filehandel.txt");
		try {
			if(files.createNewFile()) {
				System.out.println("File created sucessfully");
		}
			else {
				System.out.println("File already exist");
			}
		} catch (IOException e) {
			System.out.println("Error occured whilw creating file");
		e.printStackTrace();
		}     

		
		
//		 writing in  a file
		 try {    //		we need to keep file writer in try catch block
			 FileWriter filewrite = new FileWriter("filehandel.txt");
			 filewrite.write("This is My First File Write in java\nNow its complete"); 
			 filewrite.close();
		 }
		 catch(IOException e){
			 e.printStackTrace();
		 }   
		 
		 
		 
//		reading a file
		
		 try { 
		Scanner sc= new Scanner(files);
		while(sc.hasNextLine()) {
			String line= sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		 
		 }
		 catch(IOException e){
			 e.printStackTrace();
		 }   
		 
		
		if(files.delete()) {
			System.out.println("File deleted");
		}
		else {
			System.out.println("Error in deleting");
		}
		
		
		
		
		
		
	}

}
