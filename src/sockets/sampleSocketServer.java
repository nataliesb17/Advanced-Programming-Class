package sockets;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sampleSocketServer {
	public void start(int port) {
		System.out.println("Waiting for client connection...");
		try ( //steps to create socket, accept connection, and setup input/output
		ServerSocket serverSocket = new ServerSocket(port);		
		Socket clientSocket = serverSocket.accept(); //whenever a client connects, that will be what they connect to?
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				
				){
			System.out.println("Client connected, waiting for message");
			String fromClient = "", toClient = "";
			while((fromClient = in.readLine()) != null) {
				System.out.println("Message from client: " + fromClient);
				if ("kill server".equalsIgnoreCase(fromClient)) {
					System.out.println("Client killed server process");
					break;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting server");
		sampleSocketServer server = new sampleSocketServer();
		server.start(3001);
		System.out.println("Server stopped");
		
	}

}
