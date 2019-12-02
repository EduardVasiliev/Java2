
package main;

import entities.Facultate;
import entities.Universitate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs4ManyToOnePU");
        final EntityManager em = emf.createEntityManager();
        
        Universitate universitate = new Universitate("UPB", "Bucuresti");
        Facultate facultate = new Facultate();
        facultate.setDomeniu("Inginerie");
        facultate.setNume("ETTI");
        facultate.setUniversitate(universitate);
        
        try {
            em.getTransaction().begin();
            em.persist(facultate);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
