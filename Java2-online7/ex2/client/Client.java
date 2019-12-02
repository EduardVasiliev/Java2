package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        
        Socket socket = new Socket("localhost", 1234);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.println("1. Login");
            System.out.println("2. Create new account");
            int command = scan.nextInt();
            switch(command) {
                case 1 :
                    System.out.println("Enter username");
                    String username = scan.next();
                    System.out.println("Enter password");
                    String password = scan.next();
                    out.println("Login" + " " + username + " " + password);
                    
                    String line = br.readLine();
                    System.out.println(line + "\n");                  
                    break;
                    
                case 2 :
                    System.out.println("Create username");
                    String newUsername = scan.next();
                    System.err.println("Create password");
                    String newPassword = scan.next();
                    out.println("Create" + " " + newUsername + " " + newPassword);
                    
                    String newLine = br.readLine();
                    System.out.println(newLine + "\n");
                    break;
                    
                default :
                    System.out.println("Wrong command. Please select an action.\n");
                    
            }
        }
        
    }
}
 