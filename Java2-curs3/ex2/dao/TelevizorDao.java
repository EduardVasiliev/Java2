package dao;

import Entity.Televizor;
import javax.persistence.EntityManager;

public class TelevizorDao {
    private EntityManager em;
    
    public TelevizorDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaTelevizor(Televizor t) {
        em.persist(t);
    }
}