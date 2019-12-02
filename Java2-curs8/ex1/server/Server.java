package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import rmi.MyService;


public class Server extends UnicastRemoteObject implements MyService{
    
    public static void main(String[] args) {
        try {
            new Server();
        } catch(RemoteException e) {
            e.printStackTrace();
        }
    }
    
    public Server() throws RemoteException {
        Registry reg = LocateRegistry.createRegistry(7000);
        reg.rebind("server", this);
    }
    
    @Override
    public String reverseString(String s) throws RemoteException{
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

}