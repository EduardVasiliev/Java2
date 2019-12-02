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
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs6.ex6PU");
        final EntityManager em = emf.createEntityManager();
        final MasinaDao masinaDao = new MasinaDao(em);
        
        Masina masina = new Masina("Volvo", "S90", 35000);
        
        //set multiple Pks
        masina.setJudet("B");
        masina.setNr("10");
        masina.setCod("SQL");
        
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