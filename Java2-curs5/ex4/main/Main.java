package main;

import db.Culoare;
import db.Semafor;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs5.ex4PU");
        EntityManager em = emf.createEntityManager();
        
        Semafor s = new Semafor();
        s.setLocatie("Broadway");
        Map<Culoare, String> av = new HashMap<>();
        av.put(Culoare.ROSU, "Stai");
        av.put(Culoare.VERDE, "Mergi");
        av.put(Culoare.GALBEN, "Atentie");
        s.setAvertisment(av);
        
        try {
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
            
        } finally {
            em.close();
            emf.close();
        }
        
    }

}