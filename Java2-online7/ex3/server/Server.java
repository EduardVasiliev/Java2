package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            Socket clientSocket = serverSocket.accept();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            
            out.println(a + b);
       
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        
    }
    
}
