package socket;

import java.net.*;
import java.io.*;

public class ClientProgram {
	
//	initialize socket and input output streams 
	private Socket socket =null;
	private DataInputStream input = null;
	private DataOutputStream out = null;
	
//	constructor to put ip address and port
	public ClientProgram(String ipaddress, int port) {
		// establish a connection
		try {
			socket=new Socket(ipaddress, port);
			System.out.println("Your device is connected");
			
//			takes input from terminal
			input = new DataInputStream(System.in);
//			sends output to socket
			out = new DataOutputStream(socket.getOutputStream());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//to read message from input 
		String line ="";
		
//		keep reading until "Over" is input
		
		while(!line.equals("Over")) {
			try {
			line = input.readLine();
			out.writeUTF(line);
			}
			catch (IOException i) {
				System.out.println(i);
			}
			}
		try {
			input.close();
			out.close();
			socket.close();
		}
		catch (IOException i) {
			System.out.println(i);
		}
		}
	public static void main(String args[]) {
		ClientProgram client=new ClientProgram("127.0.0.89",5000);
	
	}
}
