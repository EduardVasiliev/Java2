package main;

import ex.Student;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        
        try {

            Class studentClass = Class.forName("ex.Student");
            Constructor studentConstructor = studentClass.getDeclaredConstructor();
            studentConstructor.setAccessible(true);
            Student s = (Student) studentConstructor.newInstance();

            Field f1 = studentClass.getDeclaredField("nume");
            f1.setAccessible(true);
            f1.set(s, "Eduard");

            Field f2 = studentClass.getDeclaredField("varsta");
            f2.setAccessible(true);
            f2.setInt(s, 23);

            Method m1 = studentClass.getDeclaredMethod("Striga");
            m1.setAccessible(true);
            m1.invoke(s);

        } catch (ClassNotFoundException | NoSuchMethodException |InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {

        }
    }
}