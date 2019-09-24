package sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class sampleSocketClient {
	Socket server;
	public void connect(String address, int port ) {
		try {
			server = new Socket(address, port);
			System.out.println("Client connected");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void start() {
		if(server == null) {
			System.out.println("Server isn't set??");
			return;
		}
		System.out.println("Listening for console input...");
		try(Scanner si = new Scanner(System.in);
			PrintWriter out = new PrintWriter(server.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
				){
			String line = "";
			while(true) {
				try {
					System.out.println("Waiting for user input...");
					line = si.nextLine();
					if(!"quit".equalsIgnoreCase(line)) {
						out.println(line);
					}
					else {
						break;
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleSocketClient client = new sampleSocketClient();
		client.connect("127.0.0.1", 3001);
		try {
			client.start();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
