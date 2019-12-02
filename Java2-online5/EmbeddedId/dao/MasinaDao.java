package dao;

import entities.Masina;
import entities.NrInmatriculare;
import javax.persistence.EntityManager;

public class MasinaDao {
    private final EntityManager em;
    
    public MasinaDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaMasina(Masina m) {
        em.persist(m);
    }
    
    public Masina cautaMasina(NrInmatriculare inmatriculare) {
        return em.find(Masina.class, inmatriculare);
    }
}
