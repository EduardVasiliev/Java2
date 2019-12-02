
package main;

import entities.IdentityCard;
import entities.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs4OneToOne2PU");
        final EntityManager em = emf.createEntityManager();
        
        IdentityCard identityCard = new IdentityCard();
        identityCard.setNumber("03329294");
        identityCard.setCode("g3j9ksj3");
        
        Person person = new Person();
        person.setNume("Eduard");
        person.setIdentityCard(identityCard);
        
        try {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
