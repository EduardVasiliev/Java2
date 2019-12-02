package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(7000);
            reg.rebind("fileservice", new FileServer());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}