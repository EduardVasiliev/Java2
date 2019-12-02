package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.MyService;

public class Client {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 7000);
            MyService serv = (MyService) reg.lookup("server");
            System.out.println(serv.reverseString("JAVA 2 CURS 8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}