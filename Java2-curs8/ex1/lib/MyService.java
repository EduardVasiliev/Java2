package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyService extends Remote {
    
    public String reverseString(String s) throws RemoteException;
    
}
