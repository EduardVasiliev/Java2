package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.ArticolService;
import service.ArticolServiceImpl;

public class Server {
    
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(1234);
            ArticolService articolService = new ArticolServiceImpl();
            reg.rebind("articolService", articolService);
        } catch (Exception e) {
        }
    }
}
