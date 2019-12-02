package remoteObject;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmi.CalculatorInterface;

public class CalculatorImpl extends UnicastRemoteObject implements CalculatorInterface{
    
    public CalculatorImpl() throws RemoteException {
        
    }
    
    @Override
    public double sum(double x, double y) throws RemoteException {
        return x + y;
    }

}
