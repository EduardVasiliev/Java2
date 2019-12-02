package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        
        Socket serverSocket = new Socket("localhost", 1234);

        BufferedReader br = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
        PrintWriter out = new PrintWriter(serverSocket.getOutputStream(), true);
        
        out.println("Hello from Client!");
        
        String line = br.readLine();
        System.out.println(line);
        
    }
    
}
