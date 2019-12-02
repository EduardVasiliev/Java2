package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.FilmService;
import service.FilmServiceImpl;

public class Server {

    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(1234);
            FilmService filmService = new FilmServiceImpl();
            reg.rebind("filmService", filmService);          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
