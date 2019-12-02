package remoteObject;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmi.MyService;

public class MyServiceImpl extends UnicastRemoteObject implements MyService{
    
    public MyServiceImpl() throws RemoteException {
        
    }
    
    @Override
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

}
