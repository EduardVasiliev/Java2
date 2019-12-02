package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import remoteObject.MyServiceImpl;
import rmi.MyService;

public class Server {
    
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1234);
            MyService reverse = new MyServiceImpl();
            registry.rebind("reverseService", reverse);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
