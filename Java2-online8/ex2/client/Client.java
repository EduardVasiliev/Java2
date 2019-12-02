package client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.MyService;

public class Client {
    
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1234);
            MyService reverse = (MyService) reg.lookup("reverseService");
            System.out.println(reverse.reverseString("Curs Java2"));
            
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
