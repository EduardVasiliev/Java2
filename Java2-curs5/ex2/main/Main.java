package main;

import db.Persoana;
import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs5.ex2PU");
        EntityManager em = emf.createEntityManager();
        
        Persoana p1 = new Persoana();
        p1.setNume("Risti");
        p1.setPrieteni(new HashMap<>());
        p1.getPrieteni().put("0741", "Andreea");
        p1.getPrieteni().put("0742", "Ionut");
        
        try {
            em.getTransaction().begin();
            em.persist(p1);
            em.getTransaction().commit();
            
            
            
        } finally {
            em.close();
            emf.close();
        }
    }
}