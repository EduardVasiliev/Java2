package dao;

import javax.persistence.EntityManager;

public class StudentDao {

    private EntityManager em;
    
    public StudentDao(EntityManager em) {
        this.em = em;
    }
}
