package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface extends Remote {
    
    public double sum(double x, double y) throws RemoteException;
}
