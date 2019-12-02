package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.RemoteService;
import service.MainService;

public class Server {
    
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(1234);
            RemoteService service = new MainService();
            reg.rebind("service", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
