
package dao;

import entities.Angajat;
import javax.persistence.EntityManager;

public class AngajatDao {
    private final EntityManager em;
    
    public AngajatDao(EntityManager em) {
        this.em = em;
    }
    
    public void addEmployee(Angajat a) {
        em.persist(a);
    }
    
}
