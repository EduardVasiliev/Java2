package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import remoteObject.CalculatorImpl;
import rmi.CalculatorInterface;

public class Server {

    public static void main(String[] args) {
        
        try {
            Registry registry = LocateRegistry.createRegistry(1234);
            CalculatorInterface calculator = new CalculatorImpl();
            registry.rebind("calculatorService", calculator);
            
        } catch(RemoteException e) {
            e.printStackTrace();
        }
    }
}
