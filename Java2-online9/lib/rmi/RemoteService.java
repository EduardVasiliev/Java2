package rmi;

import entities.Clasa;
import entities.Curs;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RemoteService extends Remote {
    
    public List<Clasa> getClase() throws RemoteException;
    
    public void adaugaCurs(Curs c) throws RemoteException;
}
