package Main;

import db.Abonat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs5.ex1PU");
        EntityManager em = emf.createEntityManager();
        
        Abonat a1 = new Abonat();
        a1.setNume("Eduard");
        Abonat a2 = new Abonat();
        a2.setNume("Andrei");
   
        List<String> contacte = new ArrayList<>();
        contacte.add("0741");
        contacte.add("0742");
        a1.setNumereApelate(contacte);
        
        List<String> contacte2 = new ArrayList<>();
        contacte2.add("0751");
        contacte2.add("0752");
        a2.setNumereApelate(contacte2);
        
        try {
            em.getTransaction().begin();
            em.persist(a1);
            em.persist(a2);
            em.getTransaction().commit();
            
        } finally {
            em.close();
            emf.close();
        }
    }
}