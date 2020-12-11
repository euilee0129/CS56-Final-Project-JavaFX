import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) {
		
		try (Socket socket = new Socket("localhost", 8080);
			Scanner scanner = new Scanner(System.in)) {
			
			// in & out 
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			String line;
			do {
				System.out.println("Enter: ");
				line = scanner.nextLine();
				out.println(line);
				
				String response = in.readLine();
				System.out.println("response: " + response);
			} while (!line.equalsIgnoreCase("bye"));
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
