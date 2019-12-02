package main;

import Annotations.Aleator;
import java.lang.reflect.Field;
import java.util.Random;
import model.Punct;

public class Main {
    public static void main(String[] args) {
        
        try {
            
            Class punctClass = Class.forName("model.Punct");
            Punct p = new Punct();
            
            Field[] fields = punctClass.getDeclaredFields();
            
            for(Field x:fields) {
                x.setAccessible(true);
                if(x.isAnnotationPresent(Aleator.class)) {
                    Aleator a = x.getAnnotation(Aleator.class);
                    
                    Random rand = new Random();
                    int maxValue = a.max();
                    x.setInt(p, rand.nextInt(maxValue));
                }
            }
            
            System.out.println(p);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}