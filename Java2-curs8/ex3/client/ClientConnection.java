package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.FileService;

public class ClientConnection {
    
    FileService serv;
    
    private ClientConnection() {
        try {
            Registry reg = LocateRegistry.getRegistry("10.8.1.49", 7000);
            serv = (FileService) reg.lookup("fileservice");
        } catch (Exception e) {
        }
    }
    
    private static final class SingletonHolder {
        private static final ClientConnection instance = new ClientConnection();
    }
    
    public static ClientConnection getInstance() {
        return SingletonHolder.instance;
    }
    
    public void createFile(String path) {
        try {
            serv.createFile(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String listFiles(String dir) {
        try {
           return serv.listFiles(dir);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}