package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FileService extends Remote{
    
    public void createFile(String dirPath) throws RemoteException;
    
    public String listFiles(String dir) throws RemoteException;
    
}
