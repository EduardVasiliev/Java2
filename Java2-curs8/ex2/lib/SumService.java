package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SumService extends Remote{

    public int sumNumbers(int a, int b) throws RemoteException;
    
}