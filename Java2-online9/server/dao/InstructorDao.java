package dao;

import javax.persistence.EntityManager;

public class InstructorDao {
    
    private EntityManager em;
    
    public InstructorDao(EntityManager em) {
        this.em = em;
    }
}
