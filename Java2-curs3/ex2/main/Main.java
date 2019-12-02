package main;

import Entity.Televizor;
import Entity.TipTelevizor;
import dao.TelevizorDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs3.ex2PU");
        EntityManager em = emf.createEntityManager();
        TelevizorDao televizorDao = new TelevizorDao(em);
        
        Televizor t = new Televizor();
        t.setDiagonala(102);
        t.setTipTelevizor(TipTelevizor.LED);
        
        try {
            
            em.getTransaction().begin();
            televizorDao.adaugaTelevizor(t);
            em.getTransaction().commit();
            
            
        } finally {
            em.close();
        }
    }
    
    
}