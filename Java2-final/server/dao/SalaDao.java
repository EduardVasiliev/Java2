package dao;

import javax.persistence.EntityManager;

public class SalaDao {
    
    private EntityManager em;
    
    public SalaDao(EntityManager em) {
        this.em = em;
    }
}
