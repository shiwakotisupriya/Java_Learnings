package socket;
import java.net.*;
import java.io.*;
public class ServerSide {
//	initialize socket and input output streams 
	private Socket socket =null;
	private ServerSocket server = null;
	private DataInputStream in = null;
	
//	constructor wit port
	
	public ServerSide (int port) {
//		starts server and waits for connection
		try {
			server = new ServerSocket(port);
			System.out.println("Server Started");
			System.out.println("Waiting for client...");
			socket = server.accept();
			System.out.println("Client accepted");
			
//			takes input from client socket
			in = new DataInputStream(
			new BufferedInputStream(socket.getInputStream()));
			String line ="";
//			reads message from client until over is not send 
			while(!line.equals("Over")) {
				try {
				line = in.readUTF();
				System.out.println(line);
				}
				catch (Exception e){
					e.printStackTrace();
				}
			}
			
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}
		public static void main(String args[]) {
			ServerSide server=new ServerSide(5000);
	}
	
	
	
}
