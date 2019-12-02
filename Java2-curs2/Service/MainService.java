package Service;

import dao.PisicaDao;
import db.Pisica;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainService {
    private EntityManagerFactory emf;
    
    public MainService() {
        emf = Persistence.createEntityManagerFactory("JavaLearningPU");
    }
    
    public void adaugaMultePisici() {
        EntityManager em = emf.createEntityManager();
        PisicaDao pisicaDao = new PisicaDao(em);
        
        try {
            em.getTransaction().begin();
            for(int i=0; i<5; i++) {
                Pisica p1 = new Pisica();
                p1.setNume("Pisica" + i);
                p1.setVarsta(i + 1);
                pisicaDao.adaugaPisica(p1);
            }
            
            em.getTransaction().commit();
            
        } finally {          
            em.close();
        }
    }
    
    public Pisica cautaPisica(int idPisica) {
        EntityManager em = emf.createEntityManager();
        PisicaDao pisicaDao = new PisicaDao(em);
        
        try {
            em.getTransaction().begin();
            return pisicaDao.cautaPisica(idPisica);  //cautaPisica din pisicaDao
            
        } finally {
            em.close();
        }
    }
    
}