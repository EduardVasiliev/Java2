package main;

import Annotations.Executa;
import beans.Operatie;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        
        try {
            
            Class operatieClass = Class.forName("beans.Operatie");
            Operatie o = new Operatie();
            
            Method[] methods = operatieClass.getDeclaredMethods();
            
            for(Method x:methods) {
                x.setAccessible(true);
                if(x.isAnnotationPresent(Executa.class)) {
                    System.out.println(x.invoke(o, 10, 20));
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}