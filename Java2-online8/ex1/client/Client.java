package client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.CalculatorInterface;

public class Client {
    
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1234);
            CalculatorInterface calculator = (CalculatorInterface) registry.lookup("calculatorService");
            
            System.out.println(calculator.sum(10, 15));
            
        } catch(RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
