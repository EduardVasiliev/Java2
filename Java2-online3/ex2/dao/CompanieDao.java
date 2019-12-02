
package dao;

import entities.Companie;
import javax.persistence.EntityManager;

public class CompanieDao {
    private final EntityManager em;
    
    public CompanieDao(EntityManager em) {
        this.em  = em;
    }
    
    public void addCompany(Companie c) {
        em.persist(c);
    }
    
    public Companie getCompany(int id) {
        return em.find(Companie.class, id);
    }
    
    public void removeCompany(int id) {
        Companie c = em.find(Companie.class, id);
        if(c != null) {
            em.remove(c);
        }
    }
    
    public Companie updateCompany(Companie c) {
        return em.merge(c);
    }
}
