package Service;

import dao.CoffeeDao;
import entities.Coffee;
import entities.Size;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Eduard Vasiliev
 */
public class MainService {
    private EntityManagerFactory emf;
    
    public MainService() {
        emf = Persistence.createEntityManagerFactory("Curs3OnlinePU");
    }
    
    public void adaugaCafea(Coffee c) {
        EntityManager em = emf.createEntityManager();
        CoffeeDao coffeeDao = new CoffeeDao(em);
        
        try {
            em.getTransaction().begin();
            coffeeDao.adaugaCafea(c);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
