package main;

import db.Carte;
import db.Librarie;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs5.ex6PU");
        EntityManager em = emf.createEntityManager();
        
        Librarie lib = new Librarie();
        lib.setLocatie("Universitate");
        
        Carte c1 = new Carte();
        c1.setTitlu("Harry Potter");
        Carte c2 = new Carte();
        c2.setTitlu("Robinson Crusoe");
        c1.setLibrarie(lib);
        c2.setLibrarie(lib);
        
        Map<String, Carte> map = new HashMap<>();
        map.put("LSG34", c1);
        map.put("ON345", c2);
        
        lib.setCarti(map);
        
        try {
            em.getTransaction().begin();
            em.persist(lib);
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }
        
    }
}