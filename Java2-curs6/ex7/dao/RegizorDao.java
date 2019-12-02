package dao;

import entity.Regizor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RegizorDao {
    private EntityManager em;
    
    public RegizorDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaRegizor(Regizor r) {
        em.persist(r);
    }
    
    // JPQL
    public List<Regizor> getDirectors() {
        String sql = "SELECT r FROM Regizor r";
        Query query = em.createQuery(sql);
        return query.getResultList();
    }
}