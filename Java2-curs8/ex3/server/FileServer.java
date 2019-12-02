package server;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.stream.Collectors;
import rmi.FileService;

public class FileServer extends UnicastRemoteObject implements FileService {

    public FileServer() throws RemoteException{
        
    }
    
    @Override
    public void createFile(String dirPath) throws RemoteException {
        try {
            Path p = Paths.get(dirPath);
            Files.createFile(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String listFiles(String dir) throws RemoteException {
        try {
            Path p = Paths.get(dir);
            return Files.list(p).map(s -> s.toString())
                                .collect(Collectors.joining("\n"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return "";
    }
}