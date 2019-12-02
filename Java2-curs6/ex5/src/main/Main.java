package main;

import dao.MasinaDao;
import entities.Masina;
import entities.NrInmatriculare;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceUnitTransactionType;

public class Main {
    public static void main(String[] args) {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs6.ex5PU");
        final EntityManager em = emf.createEntityManager();
        final MasinaDao masinaDao = new MasinaDao(em);
        
        NrInmatriculare nrInmatriculare = new NrInmatriculare("CJ", "39", "JPA");
        Masina masina = new Masina("Volvo", "S90", 35000);
        masina.setNrInmatriculare(nrInmatriculare);
        
        try {
            em.getTransaction().begin();
            masinaDao.adaugaMasina(masina);
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }
    }
}