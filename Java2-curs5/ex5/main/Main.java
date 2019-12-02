package main;

import db.Adresa;
import db.Hotel;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs5.ex5PU");
        EntityManager em = emf.createEntityManager();
        
        Adresa a1 = new Adresa();
        a1.setOras("Bucuresti");
        a1.setStrada("Iuliu Maniu");
        a1.setNumar(145);
        
        Hotel h1 = new Hotel();
        h1.setNume("Hotel");
        
        Map<String, Adresa> loc = new HashMap<>(); 
        loc.put("Principal", a1);
        h1.setLocatie(loc);
        
        try {
            em.getTransaction().begin();
            em.persist(h1);
            em.getTransaction().commit();
            
        } finally {
            em.close();
            emf.close();
        }
    }
}