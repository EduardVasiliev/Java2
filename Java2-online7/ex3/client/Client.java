package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        
        try {
            Socket serverSocket = new Socket("localhost", 1234);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
            PrintWriter out = new PrintWriter(serverSocket.getOutputStream(), true);
            
            Scanner scan = new Scanner(System.in);
            
            System.out.println("a :");
            String a = scan.nextLine();
            System.out.println("b :");
            String b = scan.nextLine();
            out.println(a);
            out.println(b);
            
            String line = br.readLine();
            System.out.println(line);
            
            
        } catch(IOException e) {
           e.printStackTrace();
        }
    }
    
}
