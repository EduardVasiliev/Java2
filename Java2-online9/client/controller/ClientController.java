package controller;

import entities.Clasa;
import entities.Curs;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Collections;
import java.util.List;
import rmi.RemoteService;

public class ClientController {
    
    private RemoteService service;
    
    private ClientController() {
        try {
            Registry reg = LocateRegistry.getRegistry(1234);
            service = (RemoteService) reg.lookup("service");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public List<Clasa> getClase() {
        try {
            return service.getClase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
    
    public void adaugaCurs(Curs c) {
        try {
            service.adaugaCurs(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ClientController instance = new ClientController();
    }
    
    public static ClientController getInstance() {
        return SingletonHolder.instance;
    }

}
