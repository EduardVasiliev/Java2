package main;

import db.Magazin;
import db.Televizor;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs5.ex3PU");
        EntityManager em = emf.createEntityManager();
        
        Magazin m = new Magazin();
        m.setNume("Flanco");
        Map<String, Televizor> tel = new HashMap<>();
        tel.put("100 LEI", Televizor.LED);
        tel.put("200 LEI", Televizor.PLASMA);
        tel.put("120 LEI", Televizor.LCD);
        m.setTelevizoare(tel);
        
        try {
            em.getTransaction().begin();
            em.persist(m);
            em.getTransaction().commit();
            
        } finally {
            em.close();
            emf.close();
        }
    }

}