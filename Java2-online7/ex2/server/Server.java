package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static void main(String[] args) throws IOException {
        
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket clientSocket = serverSocket.accept();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        
        List<String> users = new ArrayList<>();
        List<String> passwords = new ArrayList<>();
        
        while(true) {
            String line = br.readLine();
            String[] lineSplit = line.split("\\s+");
            switch(lineSplit[0]) {
                case "Login" :
                    boolean isUser = false;
                    for(int i=0; i<users.size(); i++) {
                        if(users.get(i).equals(lineSplit[1]) && passwords.get(i).equals(lineSplit[2])) {
                            isUser = true;
                        }
                    }
                    if(isUser) {
                        out.println("Welcome back " + lineSplit[1].toUpperCase());
                    } else {
                        out.println("Account not found. Please register!");
                    }
                    break;

                case "Create" :
                    users.add(lineSplit[1]);
                    passwords.add(lineSplit[2]);
                    out.println("Account created!");
                    break;
            }
            
            System.out.println("Active accounts: " + users);
        }
    }
}
