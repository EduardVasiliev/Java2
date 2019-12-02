package service;

import dao.MasinaDao;
import entities.Masina;
import entities.NrInmatriculare;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainService {
    private final EntityManagerFactory emf;
    
    public MainService() {
        emf = Persistence.createEntityManagerFactory("Curs5CompositePKPU");
    }
    
    public void adaugaMasina(Masina m) {
        EntityManager em = emf.createEntityManager();
        MasinaDao masinaDao = new MasinaDao(em);
        
        try {
            em.getTransaction().begin();
            masinaDao.adaugaMasina(m);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public Masina cautaMasina(NrInmatriculare nrInmatriculare) {
        EntityManager em = emf.createEntityManager();
        MasinaDao masinaDao = new MasinaDao(em);
        
        try {
            em.getTransaction().begin();
            return masinaDao.cautaMasina(nrInmatriculare);
        } finally {
            em.close();
        }
    }
}
