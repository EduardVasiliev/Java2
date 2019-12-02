package rmi;

import entities.Articol;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ArticolService extends Remote {
    
    public void adaugaArticol(Articol a) throws RemoteException;

}
