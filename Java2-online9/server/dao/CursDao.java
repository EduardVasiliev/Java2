package dao;

import entities.Curs;
import javax.persistence.EntityManager;

public class CursDao {
    
    private EntityManager em;
    
    public CursDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaCurs(Curs c) {
        em.persist(c);
    }
}
