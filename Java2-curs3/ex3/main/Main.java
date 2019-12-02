package main;

import Dao.PisicaDao;
import db.Pisica;
import db.RasaPisica;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs3.ex3PU");
        EntityManager em = emf.createEntityManager();
        PisicaDao pisicaDao = new PisicaDao(em);
        
        Pisica p = new Pisica();
        p.setNume("Mitzi");
        p.setRasaPisica(RasaPisica.BIRMANEZA);
        
        try {
            
            em.getTransaction().begin();
            pisicaDao.adaugaPisica(p);
            em.getTransaction().commit();
            
        } finally {
            em.close();
        }
    }
}