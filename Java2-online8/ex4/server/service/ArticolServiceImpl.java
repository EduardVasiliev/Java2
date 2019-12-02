package service;

import dao.ArticolDao;
import entities.Articol;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import rmi.ArticolService;

public class ArticolServiceImpl extends UnicastRemoteObject implements ArticolService {
    
    private EntityManagerFactory emf;
    
    public ArticolServiceImpl() throws RemoteException {
        emf = Persistence.createEntityManagerFactory("Curs8ex4-serverPU");
    }
    
    @Override
    public void adaugaArticol(Articol a) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        ArticolDao articolDao = new ArticolDao(em);
        
        try {
            em.getTransaction().begin();
            articolDao.adaugaArticol(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
