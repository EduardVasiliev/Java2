package dao;

import entities.Masina;
import javax.persistence.EntityManager;

public class MasinaDao {
    private final EntityManager em;
    
    public MasinaDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaMasina(Masina m) {
        em.persist(m);
    }

}