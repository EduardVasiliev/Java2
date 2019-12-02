package dao;

import entities.Coffee;
import javax.persistence.EntityManager;

/**
 *
 * @author Eduard Vasiliev
 */
public class CoffeeDao {
    private EntityManager em;
    
    public CoffeeDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaCafea(Coffee c) {
        em.persist(c);
    }
}
