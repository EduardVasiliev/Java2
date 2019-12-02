package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        
        ServerSocket serverSocket = new ServerSocket(1234);     
        Socket clientSocket = serverSocket.accept();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        
        out.println("Hello from Server!");
        
        String line = br.readLine();
        System.out.println(line);
        
    }
    
}
