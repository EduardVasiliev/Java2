
package service;

import dao.AngajatDao;
import dao.CompanieDao;
import entities.Angajat;
import entities.Companie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainService {
    private final EntityManagerFactory emf;
    
    public MainService() {
        emf = Persistence.createEntityManagerFactory("Curs3Online2PU2");
    }
    
    public void addCompany(Companie c) {
        EntityManager em = emf.createEntityManager();
        CompanieDao companieDao = new CompanieDao(em);
        
        try {
            em.getTransaction().begin();
            companieDao.addCompany(c);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public void addEmployee(Angajat a) {
        EntityManager em = emf.createEntityManager();
        AngajatDao angajatDao = new AngajatDao(em);
        
        try {
            em.getTransaction().begin();
            angajatDao.addEmployee(a);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public Companie getCompany(int id) {
        EntityManager em = emf.createEntityManager();
        CompanieDao companieDao = new CompanieDao(em);
        
        try {
            em.getTransaction().begin();
            return companieDao.getCompany(id);
        } finally {
            em.close();
        }
    }
    
    public void removeCompany(int id) {
        EntityManager em = emf.createEntityManager();
        CompanieDao companieDao = new CompanieDao(em);
        
        try {
            em.getTransaction().begin();
            companieDao.removeCompany(id);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public void updateCompany(Companie c) {
        EntityManager em = emf.createEntityManager();
        CompanieDao companieDao = new CompanieDao(em);
        
        try {
            em.getTransaction().begin();
            companieDao.updateCompany(c);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
