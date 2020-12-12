package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Project made and worked on by Samuel Eui Ho Lee and Janet Sujung Cho.
 */

public class Server {

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
				//
			}
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("server terminated");

	}

}
