package Dao;

import db.Pisica;
import javax.persistence.EntityManager;

public class PisicaDao {
    private EntityManager em;
    
    public PisicaDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaPisica(Pisica p) {
        em.persist(p);
    }
    
}