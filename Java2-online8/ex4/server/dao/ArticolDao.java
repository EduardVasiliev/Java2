package dao;

import entities.Articol;
import javax.persistence.EntityManager;

public class ArticolDao {
    
    private EntityManager em;
    
    public ArticolDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaArticol(Articol a) {
        em.persist(a);
    }
}
