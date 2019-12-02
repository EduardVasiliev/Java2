package control;

import entities.Articol;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.ArticolService;

public class ClientConnection {
    
    private ArticolService articolService;
    
    private ClientConnection() {
        try {
            Registry reg = LocateRegistry.getRegistry(1234);
            articolService = (ArticolService) reg.lookup("articolService");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void adaugaArticol(Articol a) {
        try {
            articolService.adaugaArticol(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ClientConnection instance = new ClientConnection();
    }
    
    public static ClientConnection getInstance() {
        return SingletonHolder.instance;
    }

}
