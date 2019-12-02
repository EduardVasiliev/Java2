package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import rmi.SumService;

public class Client {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry("10.8.1.49", 7000);
            SumService service = (SumService) reg.lookup("sumservice");
            Scanner scan = new Scanner(System.in);
            System.out.println("Set x:");
            int x = scan.nextInt();
            System.out.println("Set y:");
            int y = scan.nextInt();
            System.out.println(service.sumNumbers(x, y));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}