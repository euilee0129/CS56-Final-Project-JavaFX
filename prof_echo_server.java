import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		
		try (ServerSocket server = new ServerSocket(8080)) {
			
			System.out.println("server started, waiting for connection...");
			Socket socket = server.accept();
			
			// in & out
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			System.out.println("connection established, listening...");
			
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println("received: " + line);
				
				out.println("echo: " + line);
			}
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("server terminating...");

	}

}
