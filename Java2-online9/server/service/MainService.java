package service;

import dao.ClasaDao;
import dao.CursDao;
import entities.Clasa;
import entities.Curs;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import rmi.RemoteService;

public class MainService extends UnicastRemoteObject implements RemoteService {

    private EntityManagerFactory emf;
    
    public MainService() throws RemoteException {
        emf = Persistence.createEntityManagerFactory("Curs9-serverPU");
    }
    
    @Override
    public List<Clasa> getClase() {
        EntityManager em = emf.createEntityManager();
        ClasaDao clasaDao = new ClasaDao(em);
        return clasaDao.getClase();
    }
    
    @Override
    public void adaugaCurs(Curs c) {
        EntityManager em = emf.createEntityManager();
        CursDao cursDao = new CursDao(em);
        try {
            em.getTransaction().begin();
            cursDao.adaugaCurs(c);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
