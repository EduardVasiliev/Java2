package main;

import entities.Masina;
import entities.NrInmatriculare;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs5CompositePKPU");
        EntityManager em = emf.createEntityManager();
        
        Masina masina = new Masina("B", "27", "SQL");
        
        try {
            em.getTransaction().begin();
            em.persist(masina);
            em.getTransaction().commit();
            
        } finally {
            em.close();
        }
    }
}
